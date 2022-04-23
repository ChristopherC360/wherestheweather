package dev.crawford.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.crawford.models.Location;
import dev.crawford.repositories.LocationDAO;
import dev.crawford.services.LocationService;

@RestController
@RequestMapping("/api/location")
public class LocationController {
    
    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Location>> getAllLocations() {
        return new ResponseEntity<>(locationService.findAll(), HttpStatus.OK);
    }
}
