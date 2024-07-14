package com.wayde.wayde.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        UserDto userDto = new UserDto(id, "John Doe", "john.doe@example.com");
        return ResponseEntity.ok(userDto);
    }
}