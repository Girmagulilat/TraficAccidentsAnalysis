package com.traficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traficaccidentsanalysis.backend.model.Accident;

public interface AccidentRepository extends JpaRepository<Accident, Integer> {

}
