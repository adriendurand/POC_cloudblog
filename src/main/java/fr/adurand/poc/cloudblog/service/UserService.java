package fr.adurand.poc.cloudblog.service;

import fr.adurand.poc.cloudblog.model.User;
import fr.adurand.poc.cloudblog.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(String id) {
        return Optional.ofNullable(userRepository.findOne(id));
    }

    public Optional<User> getByEmail(String email) {
        return Optional.ofNullable((userRepository.findByEmail(email)));
    }

    public User createUser(User user) {
        return userRepository.insert(user);
    }
}
