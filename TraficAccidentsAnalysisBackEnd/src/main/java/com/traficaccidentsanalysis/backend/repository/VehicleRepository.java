package com.traficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traficaccidentsanalysis.backend.model.Vehicle;

public interface VahicleRepository extends JpaRepository<Vehicle, Long> {

}
