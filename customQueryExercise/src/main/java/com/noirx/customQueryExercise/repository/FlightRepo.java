package com.noirx.customQueryExercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noirx.customQueryExercise.entity.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer> {

}
