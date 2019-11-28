package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.samples.petclinic.model.Owner;

//Ejercicio5
public interface IOwnerService {
	
	//Ejercicio6
	Owner findById(Integer id);
    
    List<Owner> findByFirstNameContainsOrLastNameContains(String fristName, String lastName);
        
    List<Owner> findByOrderByLastName();
}
