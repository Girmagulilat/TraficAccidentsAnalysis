package com.traficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.traficaccidentsanalysis.backend.model.Pedastrian;

@Repository
public interface PedastrianRepository extends JpaRepository<Pedastrian, Integer> {

}
