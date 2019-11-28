package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.samples.petclinic.model.Vet;

//Ejercicio5
public interface IVetService {
	
		List<Vet> findByLastName(String lastName);
		
		List<Vet> findByFirstNameAndLastName(String firstName, String lastName);
		
		List<Vet> findByFirstNameOrLastName(String firstName, String lastName);
		
		List<Vet> findBySpecialties(String name);
}
