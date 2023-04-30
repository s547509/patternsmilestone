package com.annadiClasses.DMS.repository;

/**
 * @author S547509 Rohith Reddy Annadi
 * 
 */

import java.util.List;

/**
 * @author S547509 Rohith Reddy Annadi
 * 
 */

import org.springframework.data.repository.CrudRepository;

import com.annadiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog>findByName(String name);

}
