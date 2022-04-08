package com.meggot.lookimright.services;

import com.meggot.lookimright.models.Article;
import com.meggot.lookimright.models.payloads.CreateArticleRequest;

public interface ArticleGenerators {

    boolean canHandle(String articleType);

    Article generate(CreateArticleRequest createArticleRequest);
}
