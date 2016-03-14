package com.asaneasa.sports.playbigbackend.repositories;

import com.asaneasa.sports.playbigbackend.daos.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by adi2ky on 3/14/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByFirstName(String firstName);
}
