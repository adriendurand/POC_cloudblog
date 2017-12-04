package fr.adurand.poc.cloudblog.repository;

import fr.adurand.poc.cloudblog.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {

    List<Article> findByUser(String author);

    Article findByTitle(String title);
}
