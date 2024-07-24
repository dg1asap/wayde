package com.wayde.wayde.api;

import com.google.gson.Gson;
import com.wayde.wayde.domain.User;
import com.wayde.wayde.domain.UserId;
import com.wayde.wayde.infrastructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    private final Gson gson;

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        Long userId = userRepository.getNextId();
        UserDto userDto = new UserDto(userId, "John Doe", "john.doe@example.com");
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/create100")
    public ResponseEntity<String> create100Users() {
        List<Long> ids = userRepository.getNextIds(100);
        for (Long id : ids) {
            User user = new User(new UserId(id), "Nice");
            userRepository.save(user);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("Resource created successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<String> getUsers() {
        Iterable<User> users = userRepository.findAll();
        List<User> userList = new ArrayList<>();
        users.forEach(userList::add);

        String json = gson.toJson(userList);

        return ResponseEntity.ok(json);
    }
}