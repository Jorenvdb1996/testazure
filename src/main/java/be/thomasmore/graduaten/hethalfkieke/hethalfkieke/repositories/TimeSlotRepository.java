package be.thomasmore.graduaten.hethalfkieke.hethalfkieke.repositories;

import be.thomasmore.graduaten.hellospring.entities.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {
}

