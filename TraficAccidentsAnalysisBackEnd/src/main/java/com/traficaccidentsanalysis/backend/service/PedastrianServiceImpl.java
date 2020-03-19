package com.traficaccidentsanalysis.backend.service;

import com.traficaccidentsanalysis.backend.repository.PedastrianRepository;

@Service
public class PedastrianServiceImpl implements PedastrianService {
	
	@Autowired
	PedastrianRepository pedastianRepository;

}
