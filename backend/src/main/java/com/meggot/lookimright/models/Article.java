package com.meggot.lookimright.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {

    public String content;

    public String templateId;
}
