package com.asaneasa.sports.playbigbackend.repositories;

import com.asaneasa.sports.playbigbackend.daos.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by adi2ky on 3/14/16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByFirstName(String firstName);
}
