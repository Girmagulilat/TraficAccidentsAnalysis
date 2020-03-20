package com.traficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Pedastrian;

@Service
public interface PedastrianService {

	List<Pedastrian> getAllPedastrian();

	Pedastrian savePedastrian(Pedastrian pedestrian);

	void deletePedastrian(Pedastrian pedastrian);

	void updatePedastrian(Pedastrian pedastrian);
	
	
}
