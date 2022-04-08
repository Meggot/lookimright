package com.meggot.lookimright.models.payloads;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonTypeName("type")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY, property = "type") @JsonSubTypes({
        @JsonSubTypes.Type(value = CreateSubjectAffirmativeRequest.class, name = "SUBJECT_AFFIRMATIVE"),
})
public class CreateArticleRequest {

  CreateArticleRequest(String type){
    this.type = type;
  }

  String type;
  String templateId;
}

