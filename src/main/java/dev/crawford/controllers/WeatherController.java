package dev.crawford.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.crawford.models.Weather;
import dev.crawford.services.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    
    @Autowired
    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Weather>> getAllWeather() {
        return new ResponseEntity<>(weatherService.findAll(), HttpStatus.OK);
    }
}