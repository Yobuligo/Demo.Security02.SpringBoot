package com.yobuligo.DemoSecurity02.Person;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private IPersonRepository personRepository;

	@GetMapping("/persons")
	public Iterable<Person> getPersons() {
		ArrayList<Person> persons = new ArrayList<>();
		Person person = new Person();
		persons.add(person);
		return persons;
	}

}
