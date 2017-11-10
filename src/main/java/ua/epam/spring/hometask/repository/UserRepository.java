package ua.epam.spring.hometask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.epam.spring.hometask.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
