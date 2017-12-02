package fr.adurand.poc.cloudblog.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@Document(collection = "users")
public class User implements Serializable {

    @Id
    @JsonProperty("username")
    private String id;

    @Indexed(unique = true)
    private String email;

    private String firstName;

    private String lastName;

    private List<String> roles;
}

