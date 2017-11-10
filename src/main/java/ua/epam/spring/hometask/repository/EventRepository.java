package ua.epam.spring.hometask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.epam.spring.hometask.domain.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
