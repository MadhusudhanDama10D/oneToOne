package com.madhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhu.model.CarModel;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long> {

}
