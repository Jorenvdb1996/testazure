package be.thomasmore.graduaten.hethalfkieke.hethalfkieke.repositories;

import be.thomasmore.graduaten.hellospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

