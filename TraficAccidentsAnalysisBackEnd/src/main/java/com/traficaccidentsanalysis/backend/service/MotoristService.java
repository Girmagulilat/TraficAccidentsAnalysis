package com.traficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Motorist;

@Service
public interface MotoristService {
	List<Motorist> findAllMotorists();
	List<Motorist> addMotorist(Motorist motorist);
	Optional<Motorist> findById(int motoristId);
	Optional<Motorist> findByName(String motoristName);
}
 