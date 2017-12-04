package fr.adurand.poc.cloudblog.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@Document(collection = "articles")
public class Article implements Serializable{

    @Id
    private String id;

    private String title;

    private String content;

    @JsonProperty("author")
    private String user;

    private Date creationDate;
}
