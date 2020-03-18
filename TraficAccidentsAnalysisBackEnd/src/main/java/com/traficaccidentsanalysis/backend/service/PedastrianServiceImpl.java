package com.traficaccidentsanalysis.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.repository.PedastrianRepository;

@Service
public class PedastrianServiceImpl implements PedastrianService {
	
	@Autowired
	PedastrianRepository pedastianRepository;

}
