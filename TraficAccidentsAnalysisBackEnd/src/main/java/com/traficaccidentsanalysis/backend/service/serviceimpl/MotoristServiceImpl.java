package com.traficaccidentsanalysis.backend.service.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Motorist;
import com.traficaccidentsanalysis.backend.repository.MotoristRepository;
import com.traficaccidentsanalysis.backend.service.MotoristService;


	@Service
	public class MotoristServiceImpl implements MotoristService{
		@Autowired
		MotoristRepository motoristRepository;
		@Override
		
		public List<Motorist> addMotorist(Motorist motorist) {
			motoristRepository.save(motorist);
			return motoristRepository.findAll();
		}
		@Override
		public List<Motorist> findAllMotorists() {
			return motoristRepository.findAll();
		}
		

		@Override
		public boolean findById(int motoristId) {
			
			return motoristRepository.existsBymotoristid( motoristId);
		
		
		}
		@Override
		public Optional<Motorist> findByName(String motoristName) {
			// TODO Auto-generated method stub
			return null;
		}

	


}
