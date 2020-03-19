package com.traficaccidentsanalysis.backend.repository;

import java.util.Optional;

import com.traficaccidentsanalysis.backend.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    
Optional<Role> findByName(String roleName);
  

}
