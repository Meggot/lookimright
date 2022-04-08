package com.meggot.lookimright.models.payloads;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@JsonTypeName("SUBJECT_AFFIRMATIVE")
public class CreateSubjectAffirmativeRequest extends CreateArticleRequest {

    CreateSubjectAffirmativeRequest() {
        super("SUBJECT_AFFIRMATIVE");
    }
    String subject;
    String affirmative;
}
