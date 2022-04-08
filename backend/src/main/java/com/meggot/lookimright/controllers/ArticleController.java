package com.meggot.lookimright.controllers;

import com.meggot.lookimright.models.Article;
import com.meggot.lookimright.models.payloads.CreateArticleRequest;
import com.meggot.lookimright.services.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/articles")
public class ArticleController {

    ArticleService articleService;

    @Autowired
    ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public Article createArticleRequest(@RequestBody CreateArticleRequest createArticleRequest) {
        log.info(createArticleRequest.toString());
        return articleService.handleCreateArticleRequest(createArticleRequest);
    }
}
