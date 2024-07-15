package com.wayde.wayde.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class User {

    @Id
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    public User(UserId userId, String name) {
        this.id = userId.getId();
        this.name = name;
    }
}
