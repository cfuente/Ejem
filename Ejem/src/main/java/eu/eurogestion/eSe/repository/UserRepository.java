package eu.eurogestion.eSe.repository;

import eu.eurogestion.eSe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
