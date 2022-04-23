package dev.crawford.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.crawford.models.Weather;

@Repository
public interface WeatherDAO extends JpaRepository<Weather, Integer> {
    Weather findById(int id);
}
