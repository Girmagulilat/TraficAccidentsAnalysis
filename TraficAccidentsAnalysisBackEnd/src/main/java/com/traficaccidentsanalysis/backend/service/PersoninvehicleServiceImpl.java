package com.traficaccidentsanalysis.backend.service;

import com.traficaccidentsanalysis.backend.repository.PersoninvehicleRepository;

@Service
public class PersoninvehicleServiceImpl implements PersoninvehicleService {
	
	@Autowired
	PersoninvehicleRepository personinvehicleRepository;
}
