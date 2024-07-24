package com.wayde.wayde.infrastructure;

import com.wayde.wayde.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT nextval('user_id_sequence')", nativeQuery = true)
    Long getNextId();

    @Query(value = "SELECT nextval('user_id_sequence') FROM generate_series(1, ?1)",
            nativeQuery = true)
    List<Long> getNextIds(int count);
}
