package com.traficaccidentsanalysis.backend.service;

import java.util.List;



import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Motorist;

@Service
public interface MotoristService {
	List<Motorist> findAllMotorists();
	List<Motorist> addMotorist(Motorist motorist);
	Motorist findMotoristByMotoristId(int MotoristId);
	boolean MotoristExistsByMotoristId(int Motorist);
	
}
	
	
