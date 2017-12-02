package fr.adurand.poc.cloudblog.service;

import fr.adurand.poc.cloudblog.model.User;
import fr.adurand.poc.cloudblog.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public Optional<User> getById(String id) {
        return Optional.ofNullable(repository.findOne(id));
    }

    public Optional<User> getByEmail(String email) {
        return Optional.ofNullable((repository.findOne(email)));
    }

    public User createUser(User user) {
        return repository.insert(user);
    }
}
