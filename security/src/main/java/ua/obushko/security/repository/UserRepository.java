package ua.obushko.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.obushko.security.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
