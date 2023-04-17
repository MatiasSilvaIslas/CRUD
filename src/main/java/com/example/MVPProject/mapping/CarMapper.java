package com.example.MVPProject.mapping;

import com.example.MVPProject.dto.CarDto;
import com.example.MVPProject.entity.CarEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarMapper {
    public CarDto convertEntityToDTO(CarEntity car){
        CarDto carDto = new CarDto();
        carDto.setIdCar(car.getIdCar());
        carDto.setBrand(car.getBrand());
        carDto.setModel(car.getModel());
        carDto.setColour(car.getColour());
        carDto.setPrice(car.getPrice());
        carDto.setStock(car.getStock());
        return carDto;
    }

    public CarEntity convertDtoToEntity(CarDto carDto){
        CarEntity car = new CarEntity();
        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setColour(carDto.getColour());
        car.setPrice(carDto.getPrice());
        car.setStock(carDto.getStock());
        return car;
    }

    public List<CarDto> carEntityListToDTOList(List<CarEntity> entities){
        List<CarDto> dtos = new ArrayList<>();
        for(CarEntity entity : entities){
            dtos.add(this.convertEntityToDTO(entity));
        }
        return dtos;
    }

    public List<CarEntity> carDtoListToEntityList(List<CarDto> dtos){
        List<CarEntity> entities = new ArrayList<>();
        for(CarDto dto : dtos){
            entities.add(this.convertDtoToEntity(dto));
        }
        return entities;
    }
}
