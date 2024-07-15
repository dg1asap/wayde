package com.wayde.wayde.domain;

import com.google.gson.Gson;
import com.wayde.wayde.shared.ValueObject;
import lombok.Getter;

@Getter
public final class UserId implements ValueObject<UserId> {

    private final Long id;

    public UserId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return id.equals(userId.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean sameValueAs(UserId other) {
        if (other == null) return false;
        return id.equals(other.id);
    }
}
