package com.traficaccidentsanalysis.backend.repository;

import java.util.List;
import java.util.Optional;

import com.traficaccidentsanalysis.backend.model.Motorist;

@Repository
public interface MotoristRepository extends JpaRepository<Motorist, Long> {

	Optional<Motorist> findByMotoristid(int motoristId);
	List<Motorist> findAllMotorists();
	Motorist findMotoristByMotoristId(int motoristId);
    boolean existsBymotoristid(int motorist);

}
