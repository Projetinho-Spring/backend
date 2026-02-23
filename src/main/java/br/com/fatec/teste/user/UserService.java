package br.com.fatec.teste.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(String id) {
        return repository.findById(id);
    }

    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
