package com.traficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.traficaccidentsanalysis.backend.model.Accident;

@Service
public interface AccidentService {
List<Accident> findAllAccidents();
List<Accident> addAccident(Accident accident);
}
