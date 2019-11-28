/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.SpecialityRepository;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.samples.petclinic.model.Vet;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {
	@Autowired
	VetRepository vetRepository;
	@Autowired
	OwnerRepository ownerRepository;
	
	private static final Logger log = LoggerFactory.getLogger(PetClinicApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);
    }
    
    @Bean
	public CommandLineRunner demoVetRepository(VetRepository vetRepository, SpecialityRepository specialityRepository) {
		return (args) -> {
			log.info("*****************************************************");
			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
			log.info("*****************************************************");
			
			//Ejercicio 1
//			Vet vetNew = new Vet();
//			vetNew.setFirstName("Manuel");
//			vetNew.setLastName("Melero");
//			vetRepository.save(vetNew);
//			
//			Vet manu = vetRepository.findOne(vetNew.getId());
//			
//			Specialty speciNew = new Specialty();
//			speciNew.setId(2);
//			speciNew.setName("surgery");
//			
//			manu.addSpecialty(speciNew);
//			vetRepository.save(manu);
//			
//			log.info(manu.toString());
//
//			List<Vet> vets = vetRepository.findAll();
//			
//			for(Vet vet : vets) {
//				log.info(vet.toString());
//			}
			
			//Ejercicio2
//			List<Vet> vets1 = vetRepository.findByLastName("Melero");
//			
//			for(Vet vet : vets1) {
//				log.info(vet.toString());
//			}
//			
//			List<Vet> vets2 = vetRepository.findByFirstNameAndLastName("Manuel", "Melero");
//			
//			for(Vet vet : vets2) {
//				log.info(vet.toString());
//			}
//			
//			List<Vet> vets3 = vetRepository.findByFirstNameOrLastName("Robert", "Melero");
//			
//			for(Vet vet : vets3) {
//				log.info(vet.toString());
//			}
			
			//Ejercicio3
//			List<Vet> vets4 = vetRepository.findBySpecialties("radiology");
//			
//			for(Vet vet : vets4) {
//				log.info(vet.toString());
//			}
			
			//Ejercicio4
//			List<Owner> Owners1 = ownerRepository.findByFirstNameContainsOrLastNameContains("eor", "an");
//			
//			for(Owner Owner : Owners1) {
//				log.info(Owner.toString());
//			}
//			
//			List<Owner> Owners2 = ownerRepository.findByOrderByLastName();
//			
//			for(Owner Owner : Owners2) {
//				log.info(Owner.toString());
//			}
			
			
			
		};
	}
    
}
