package lk.ijse.se10.jwt.repository;

import lk.ijse.se10.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByEmail(String email);
    boolean existsByEmail(String name);
    int deleteByEmail(String email);
}
