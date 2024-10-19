package dev.gokhana.reactiveapi.service;

import dev.gokhana.reactiveapi.model.User;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> getUserById(int id);

    Flux<User> getUsers();

    Mono<String> saveUser(User user);
    Mono<String> noop(int id);
    Mono<User> updateUser(int id, User user);

    Mono<Void> deleteUser(int id);

    Mono<User>  getGuestUserById(int id);
}
