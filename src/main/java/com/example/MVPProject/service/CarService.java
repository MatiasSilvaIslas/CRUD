package com.example.MVPProject.service;

import com.example.MVPProject.dto.CarDto;
import com.example.MVPProject.entity.CarEntity;
import com.example.MVPProject.mapping.CarMapper;
import com.example.MVPProject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class CarService {
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private CarRepository carRepository;

   public List<CarDto> getAllCars(){
       List<CarEntity> entities = carRepository.findAll();
       return carMapper.carEntityListToDTOList(entities);
   }

      public CarDto save (CarDto carDto){
        CarEntity carEntity = carMapper.convertDtoToEntity(carDto);
        CarEntity carSaved = carRepository.save(carEntity);
          return carMapper.convertEntityToDTO(carSaved);
   }

    public List<CarDto> saveAll(List<CarDto> carDtos) {
       List<CarEntity> carEntities = carMapper.carDtoListToEntityList(carDtos);
       List<CarEntity> carsSaved = carRepository.saveAll(carEntities);
        return carMapper.carEntityListToDTOList(carsSaved);
    }

    public Optional<CarDto> findOneById(Long carId){
        if (carId == null || carId<= 0) return Optional.empty();
        CarDto carDto = carMapper.convertEntityToDTO(carRepository.findById(carId).get());
        return Optional.ofNullable(carDto);
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    public CarDto updateCarById(CarDto carDto, long carId){
       Optional<CarEntity> carEntity = carRepository.findById(carId);
       if(carEntity.isPresent()) {
           CarEntity car = carEntity.get();
           if(carDto.getStock()!=null) car.setStock(carDto.getStock());
           if(carDto.getPrice()!=null) car.setStock(carDto.getStock());
           if(!carDto.getColour().isEmpty()) car.setColour(carDto.getColour());
           if(!carDto.getModel().isEmpty()) car.setModel(carDto.getModel());
           if(!carDto.getBrand().isEmpty()) car.setBrand(carDto.getBrand());
           carRepository.save(car);
           return carMapper.convertEntityToDTO(car);
       }
       return null;
    }

}
