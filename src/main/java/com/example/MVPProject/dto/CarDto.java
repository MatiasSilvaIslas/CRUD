package com.example.MVPProject.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Data

public class CarDto implements Serializable {
    private long idCar;
    private String brand;
    private String model;
    private String colour;
    private Double price;
    private Integer stock;
}
