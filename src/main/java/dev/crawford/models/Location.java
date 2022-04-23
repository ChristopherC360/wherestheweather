package dev.crawford.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "location")
@AllArgsConstructor @NoArgsConstructor @Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationId;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "state")
    private String stateName;

    @Column(name = "zip_code")
    private int zipCode;

    @OneToMany(mappedBy = "location")
    private List<Weather> weather;
}
