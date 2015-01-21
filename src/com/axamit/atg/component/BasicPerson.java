package com.axamit.atg.component;

import atg.nucleus.GenericService;
import atg.repository.Repository;


public class BasicPerson extends GenericService {
	
	private String personName;
	private Repository repository;
	
	public void setPersonName(String name) {
		this.personName = name;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
	public Repository getRepository() {
		return this.repository;
	}

}
