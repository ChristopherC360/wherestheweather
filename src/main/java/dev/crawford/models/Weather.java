package dev.crawford.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "weather")
@AllArgsConstructor @NoArgsConstructor @Data
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    private double temperature;

    @Column(name = "wind_speed")
    private double windSpeed;

    private double humidity;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
