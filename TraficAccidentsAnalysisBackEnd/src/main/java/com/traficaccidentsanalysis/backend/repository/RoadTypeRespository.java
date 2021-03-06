package com.traficaccidentsanalysis.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traficaccidentsanalysis.backend.model.Roadtype;
@Repository
public interface RoadTypeRespository extends JpaRepository<Roadtype, Integer> {
Optional<Roadtype> findById(int Roadtype);
}
