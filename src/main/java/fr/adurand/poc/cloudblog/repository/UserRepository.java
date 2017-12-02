package fr.adurand.poc.cloudblog.repository;

import fr.adurand.poc.cloudblog.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
