package com.okex.open.api.config;

import com.google.gson.*;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public class CustomGsonConverterFactory extends Converter.Factory {
  private final GsonConverterFactory innerFactory;

  public static CustomGsonConverterFactory create() {
    final GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(BigDecimal.class, new BigDecimalDeserializer());
    return create(gsonBuilder.create());
  }

  public static CustomGsonConverterFactory create(Gson gson) {
    if (gson == null) {
      throw new NullPointerException("gson == null");
    } else {
      return new CustomGsonConverterFactory(gson);
    }
  }

  private CustomGsonConverterFactory(Gson gson) {
    this.innerFactory = GsonConverterFactory.create(gson);
  }

  public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
    return innerFactory.responseBodyConverter(type, annotations, retrofit);
  }

  public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
    return innerFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
  }

  static class BigDecimalDeserializer implements JsonDeserializer<BigDecimal> {
    @Override
    public BigDecimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {
      final String str = json.getAsString();
      if (str == null || str.isBlank()) return null;
      return new BigDecimal(str);
    }
  }
}
