package com.traficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Accident;
import com.traficaccidentsanalysis.backend.repository.AccidentRepository;
@Service
public class AccidentServiceImpl implements AccidentService {
	@Autowired
	AccidentRepository accidentRepository;

	@Override
	public List<Accident> findAllAccidents() {
		
		return  accidentRepository.findAll();
	}

	@Override
	public List<Accident> addAccident(Accident accident) {
		accidentRepository.save(accident);
		return accidentRepository.findAll();
	}

}
