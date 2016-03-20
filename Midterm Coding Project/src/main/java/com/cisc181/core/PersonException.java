package com.cisc181.core;

public class PersonException extends Exception {
	private String Person;	

	public PersonException(String Person) {
		this.Person = Person;
	}
	public String getPerson() {
		return Person;
	}

}
