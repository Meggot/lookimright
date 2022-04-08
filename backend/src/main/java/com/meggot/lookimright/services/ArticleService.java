package com.meggot.lookimright.services;

import com.meggot.lookimright.models.Article;
import com.meggot.lookimright.models.exceptions.ArticleGenerationException;
import com.meggot.lookimright.models.payloads.CreateArticleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    List<ArticleGenerators> articleGenerators;

    @Autowired
    ArticleService(List<ArticleGenerators> articleGenerators) {
        this.articleGenerators = articleGenerators;
    }

    public Article handleCreateArticleRequest(CreateArticleRequest request) {
        return articleGenerators.stream()
                .filter(articleGenerator -> articleGenerator.canHandle(request.getType()))
                .findAny()
                .orElseThrow(() -> new ArticleGenerationException("Cannot find any Article generator that can handle this type."))
                .generate(request);
    }
}
