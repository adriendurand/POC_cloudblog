package fr.adurand.poc.cloudblog.service;

import fr.adurand.poc.cloudblog.model.Article;
import fr.adurand.poc.cloudblog.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    public Optional<Article> getById(String id) {
        return Optional.ofNullable(articleRepository.findOne(id));
    }

    public Optional<Article> getByTitle(String title) {
        return Optional.ofNullable(articleRepository.findByTitle(title));
    }

    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    public Optional<List<Article>> getAllByAuthor(String author) {
        return Optional.ofNullable(articleRepository.findByUser(author));
    }

    public Article createArticle(Article article) {return articleRepository.insert(article);}
}
