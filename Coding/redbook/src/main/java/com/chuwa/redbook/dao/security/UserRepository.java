package com.chuwa.redbook.dao.security;

import com.chuwa.redbook.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByAccountOrEmail(String account, String email);

    Optional<User> findByAccount(String username);

    Boolean existsByAccount(String user);

    Boolean existsByEmail(String email);
}
