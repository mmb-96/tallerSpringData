package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.stereotype.Service;

//Ejercicio5
@Service
public class VetService implements IVetService{
	
	@Autowired
	VetRepository vetRepository;

	@Override
	public List<Vet> findByLastName(String lastName) {
		return vetRepository.findByLastName(lastName);
	}

	@Override
	public List<Vet> findByFirstNameAndLastName(String firstName, String lastName) {
		return vetRepository.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public List<Vet> findByFirstNameOrLastName(String firstName, String lastName) {
		return vetRepository.findByFirstNameOrLastName(firstName, lastName);
	}

	@Override
	public List<Vet> findBySpecialties(String name) {
		return vetRepository.findBySpecialties(name);
	}

}
