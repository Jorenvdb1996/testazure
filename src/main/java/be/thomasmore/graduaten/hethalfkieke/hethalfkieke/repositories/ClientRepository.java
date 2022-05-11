package be.thomasmore.graduaten.hethalfkieke.hethalfkieke.repositories;

import be.thomasmore.graduaten.hellospring.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

