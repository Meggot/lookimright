package com.meggot.lookimright.services;

import com.meggot.lookimright.models.Article;
import com.meggot.lookimright.models.payloads.CreateArticleRequest;
import org.springframework.stereotype.Component;

@Component
public class SubjectAffirmativeArticleGenerator implements ArticleGenerators{
    @Override
    public boolean canHandle(String articleType) {
        return articleType.equalsIgnoreCase("SUBJECT_AFFIRMATIVE");
    }

    @Override
    public Article generate(CreateArticleRequest createArticleRequest) {
        return new Article("Bollocks", "1");
    }
}
