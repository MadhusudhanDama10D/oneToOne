package com.madhu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.madhu.model.Car;
import com.madhu.model.CarModel;
import com.madhu.repository.CarRepository;
import com.madhu.repository.CardetialRepository;

@Component
public class CartaskdbService {

	@Autowired
	CarRepository carRepository;
	@Autowired
	CardetialRepository Repository;

	public CarModel insert(CarModel carmodel) {

		return carRepository.save(carmodel);
	}

	public Car newInsert(Car car) {

		return Repository.save(car);
	}

	public ArrayList<CarModel> getall() {

		return (ArrayList<CarModel>) carRepository.findAll();
	}

	public ArrayList<Car> newGetall() {

		return (ArrayList<Car>) Repository.findAll();
	}

//	public void delete(Car a) {
//		Repository.delete(a);
//	}

	
	public void deleteall() {
		
		Repository.deleteAll();
	}

}