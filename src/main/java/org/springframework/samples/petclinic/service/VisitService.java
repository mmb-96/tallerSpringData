package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Service;
//Ejercicio5
@Service
public class VisitService implements IVisitService {

	@Autowired
	VisitRepository visitRepository;
	
	@Override
	public List<Visit> findByPetId(Integer petId) {
		return visitRepository.findByPetId(petId);
	}

}
