package com.madhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhu.model.Car;

@Repository
public interface CardetialRepository extends JpaRepository<Car, Long> {

}