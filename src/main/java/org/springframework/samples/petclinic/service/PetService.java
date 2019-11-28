package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.stereotype.Service;

//Ejercicio5
@Service
public class PetService implements IPetService {

	@Autowired
	PetRepository petRepository;
}
