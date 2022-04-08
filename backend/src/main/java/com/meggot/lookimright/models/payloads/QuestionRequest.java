package com.meggot.lookimright.models.payloads;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("QUESTION")
public class QuestionRequest extends CreateArticleRequest{
    String question;

    QuestionRequest() {
        super("QUESTION");
    }
}
