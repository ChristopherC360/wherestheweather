package dev.crawford.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.crawford.models.Weather;
import dev.crawford.repositories.WeatherDAO;
import dev.crawford.services.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    
    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("/all")
    public ResponseEntity<List<Weather>> getAllWeather() {
        return new ResponseEntity<>(weatherService.findAll(), HttpStatus.OK);
    }
}