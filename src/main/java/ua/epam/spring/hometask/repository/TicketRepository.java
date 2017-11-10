package ua.epam.spring.hometask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.epam.spring.hometask.domain.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
