package com.traficaccidentsanalysis.backend.service.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Pedastrian;
import com.traficaccidentsanalysis.backend.repository.PedastrianRepository;
import com.traficaccidentsanalysis.backend.service.PedastrianService;

@Service
public class PedastrianServiceimpl implements PedastrianService {
	
	@Autowired
	PedastrianRepository pedastianRepository; 

	@Override
public   List<Pedastrian>  getAllPedastrian() {
	return getAllPedastrian();
}

	@Override
 public   Pedastrian savePedastrian(Pedastrian peaestrian) {
	return null;
}
	@Override
	public void deletePedastrian(Pedastrian pedastrian) {
}
	@Override
 public  void updatePedastrian(Pedastrian pedastrian) {
}
}
