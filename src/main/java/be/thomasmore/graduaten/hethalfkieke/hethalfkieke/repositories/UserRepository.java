package be.thomasmore.graduaten.hethalfkieke.hethalfkieke.repositories;

import be.thomasmore.graduaten.hellospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}




