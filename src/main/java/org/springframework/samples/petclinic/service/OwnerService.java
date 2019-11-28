package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

//Ejercicio5
@Service
public class OwnerService implements IOwnerService{

	@Autowired
	OwnerRepository ownerRepository;

	//Ejercicio6
	@Override
	public Owner findById(Integer id) {
		return ownerRepository.findById(id);
	}

	@Override
	public List<Owner> findByFirstNameContainsOrLastNameContains(String fristName, String lastName) {
		return ownerRepository.findByFirstNameContainsOrLastNameContains(fristName, lastName);
	}

	@Override
	public List<Owner> findByOrderByLastName() {
		return ownerRepository.findByOrderByLastName();
	}
}
