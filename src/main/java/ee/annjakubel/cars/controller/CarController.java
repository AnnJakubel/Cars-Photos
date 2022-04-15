package ee.annjakubel.cars.controller;

import ee.annjakubel.cars.model.Car;
import ee.annjakubel.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("cars")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @PostMapping("cars")
    public List<Car> addCar(@RequestBody Car car) {
            carRepository.save(car);
            return carRepository.findAll();
    }

    @DeleteMapping("cars/{id}")
    public List<Car> deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
        return carRepository.findAll();
    }

    @PutMapping("Cars")
    public List<Car> editCar(@RequestBody Car car) {
        carRepository.save(car);
        return carRepository.findAll();
    }

    @DeleteMapping("cars")
    public String deleteAllCars() {
        carRepository.flush();
        return "All items deleted";
    }

}
