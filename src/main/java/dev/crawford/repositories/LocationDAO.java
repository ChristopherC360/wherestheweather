package dev.crawford.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.crawford.models.Location;

@Repository
public interface LocationDAO  extends JpaRepository<Location, Integer> {
    Location findById(int id);
}
