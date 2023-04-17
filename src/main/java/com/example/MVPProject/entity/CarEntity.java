package com.example.MVPProject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cars")
public class CarEntity {
    @Id
    @Column(name = "ID_CAR")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idCar;
    @Size(max = 20)
    @NotBlank
    @Column(name = "BRAND")
    private String brand;
    @Size(max = 20)
    @NotBlank
    @Column(name = "MODEL")
    private String model;
    @Size(max = 20)
    @NotBlank
    @Column(name = "COLOUR")
    private String colour;
    @DecimalMin("0.00")
    @NotNull
    @Column(name = "PRICE")
    private double price;
    @Min(0)
    @NotNull
    @Column (name = "STOCK")
    private int stock;
}
