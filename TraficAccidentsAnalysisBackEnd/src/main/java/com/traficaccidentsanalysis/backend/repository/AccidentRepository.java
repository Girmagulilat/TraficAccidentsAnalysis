package com.traficaccidentsanalysis.backend.repository;

import com.traficaccidentsanalysis.backend.model.Motorist;

@Repository
public interface AccidentRepository extends JpaRepository<Accident, Long>{

}
