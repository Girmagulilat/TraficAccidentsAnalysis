package com.traficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;

import com.traficaccidentsanalysis.backend.model.Role;
import com.traficaccidentsanalysis.backend.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
@Autowired
	RoleRepository roleRepository;
	

	@Override
	public Role addRole(Role role) {
		
		return roleRepository.save(role);
	}


	@Override
	public Optional<Role> findByName(String roleName) {

		return roleRepository.findByName(roleName);
	}

	@Override
	public List<Role> findAllRole() {
		
		return roleRepository.findAll();
	}


	@Override
	public Optional<Role> findById(int roleId) {
		
		return roleRepository.findById(roleId);
	}


}
