package dev.crawford.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.crawford.models.Location;
import dev.crawford.repositories.LocationDAO;

@Service
public class LocationService {

    @Autowired
    private LocationDAO locationDAO;

    public List<Location> findAll() {
        return locationDAO.findAll();
    }
}
