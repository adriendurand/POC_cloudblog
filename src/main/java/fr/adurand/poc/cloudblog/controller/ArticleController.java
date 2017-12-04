package fr.adurand.poc.cloudblog.controller;

import fr.adurand.poc.cloudblog.model.Article;
import fr.adurand.poc.cloudblog.service.ArticleService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getById(@PathVariable String id) {
        return articleService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/title/{title}/")
    public ResponseEntity getByTitle(@PathVariable String title) {
        return articleService.getByTitle(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/author/{author}/")
    public ResponseEntity getByAuthor(@PathVariable String author) {
        return articleService.getAllByAuthor(author)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll() {return  ResponseEntity.ok(articleService.getAll());}

    @PostMapping(value = "/createArticle", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createArticle(@RequestBody Article article) {
        return ResponseEntity.ok(articleService.createArticle(article));
    }
}
