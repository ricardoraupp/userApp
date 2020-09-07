package com.raupp.userApp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface userRepository extends JpaRepository<User, BigInteger> {

    List<User> findByuserId(BigInteger id);
    List<User> findBycourseId(BigInteger id);
}
