package com.creatifcubed.minesvr.models;

import com.google.gson.{JsonSerializer, JsonDeserializer, JsonElement, JsonPrimitive, JsonSerializationContext, JsonDeserializationContext};
import java.lang.reflect.Type;

class SemVerSerializer() extends JsonSerializer[SemVer] with JsonDeserializer[SemVer] {
  def serialize(src: SemVer, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = {
    return new JsonPrimitive(src.toString());
  }
  def deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): SemVer = {
    return new SemVer(json.getAsString());
  }
}