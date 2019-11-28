package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.samples.petclinic.model.Visit;

//Ejercicio5
public interface IVisitService {
	
	List<Visit> findByPetId(Integer petId);

}
