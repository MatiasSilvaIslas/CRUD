package com.example.MVPProject.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cars")
public class CarEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "ID_CAR")
    private String idCar;

    @Column(name = "BRAND", nullable = false, length = 20)
    private String brand;
    @Column(name = "MODEL", nullable = false, length = 20)
    private String model;
    @Column(name = "COLOUR", nullable = false, length = 10)
    private String colour;
    @Column(name = "PRICE", nullable = false)
    private Double price;
    @Column (name = "STOCK")
    private Integer stock;
}
