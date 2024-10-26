package com.Techietk.Springsecurity_JWTF.Repository;

import com.Techietk.Springsecurity_JWTF.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    Optional<User> findByEmail(String email);
}
