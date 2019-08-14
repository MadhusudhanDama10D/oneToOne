package com.madhu.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.model.Car;
import com.madhu.model.CarModel;
import com.madhu.service.CartaskdbService;

@RestController
@RequestMapping("/car")
public class CartaskdbController {
	@Autowired
	CartaskdbService service;

	@PostMapping("/insert")
	private CarModel insert(@RequestBody CarModel a) {
		return service.insert(a);
	}

	@PostMapping("/newinsert")
	private Car newInsert(@RequestBody Car b) {
		return service.newInsert(b);
	}

	@GetMapping("/getall")
	private ArrayList<CarModel> getall() {
		return service.getall();
	}

	@GetMapping("/newgetall")
	private ArrayList<Car> newGetall() {
		return service.newGetall();
	}
//
//	@DeleteMapping("delete/{id}")
//	private void delete(@PathVariable long id, CarModel a) {
//		service.delete(a);
//		 
//	}

//	@DeleteMapping("deleteall")
//	private void deleteall() {
//		service.deleteall();
//	}
//
//	@PutMapping("update/{id}")
//	private CarModel update(@PathVariable long id, @RequestBody CarModel a) throws  InvalidNameException  {
//
//		return service.update(id, a);
//	}
}
