package dev.crawford.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.crawford.models.Weather;
import dev.crawford.repositories.WeatherDAO;

@Service
public class WeatherService {

    @Autowired
    private WeatherDAO weatherDAO;

    public List<Weather> findAll() {
        return weatherDAO.findAll();
    }
}
