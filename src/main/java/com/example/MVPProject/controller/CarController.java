package com.example.MVPProject.controller;

import com.example.MVPProject.dto.CarDto;
import com.example.MVPProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cars")
public class CarController {

    @Autowired
    private CarService carService;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "/save")
    public ResponseEntity<CarDto> save (@RequestBody CarDto car){
        CarDto carSaved = carService.save(car);
        return ResponseEntity.status(HttpStatus.CREATED).body(carSaved);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "saveAll")
    public ResponseEntity<List<CarDto>> saveAll(@RequestBody List<CarDto> carDtos){
        List<CarDto> carDtosSaved = carService.saveAll(carDtos);
        return  ResponseEntity.status(HttpStatus.CREATED).body(carDtosSaved);
    }

    @GetMapping
    public  ResponseEntity <List<CarDto>> getAll(){
        List<CarDto> cars = carService.getAllCars();
        return ResponseEntity.ok().body(cars);
    }

    @GetMapping("/{carId}")
    public ResponseEntity<Optional<CarDto>> findById(@PathVariable long carId) {
        Optional<CarDto> carDto =  carService.findOneById(carId);
        if(carDto.isPresent()) return ResponseEntity.ok(carDto);
        else return ResponseEntity.notFound().build();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CarDto> deleteCarById(@PathVariable long id){
        carService.deleteCarById(id);
        return ResponseEntity.ok().build();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "update/{carId}")
    public ResponseEntity<CarDto> updateCarById(@RequestBody CarDto car, @PathVariable long carId){
        CarDto carUpdated= carService.updateCarById(car, carId);
        return ResponseEntity.status(HttpStatus.OK).body(carUpdated);
    }
}
