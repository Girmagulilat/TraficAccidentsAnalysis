package com.traficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Roadtype;

@Service
public interface RoadtypeService {

	Roadtype addRoadtype(Roadtype roadtype);
	List<Roadtype>findallRoadtype();
	Optional<Roadtype>findById(int Roaftype);
	
}
