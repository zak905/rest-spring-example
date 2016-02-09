package com.opencode.restexample;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
public class PersonController {
	@RequestMapping(value="{id}", method= RequestMethod.GET)
	public @ResponseBody Person getPerson(@PathVariable Integer id){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonRepository repository = context.getBean(PersonRepository.class);
		
		Person person = repository.retrieve(id);
		
		person.add(linkTo(PersonController.class).slash(id).withSelfRel());
		person.add(linkTo(PersonController.class).slash(id).slash("account").withRel("account"));
		person.add(linkTo(PersonController.class).slash(id).slash("profile").withRel("profile"));
	
		return person;
	}
	
	@RequestMapping(value="{id}/profile", method=RequestMethod.GET)
	public @ResponseBody Profile getProfile(@PathVariable Integer id){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonRepository repository = context.getBean(PersonRepository.class);
		Person person = repository.retrieve(id);
	 return person.getProfile();
		
	}
	
	@RequestMapping(value="{id}/account", method=RequestMethod.GET)
	public @ResponseBody Account getAccount(@PathVariable Integer id){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonRepository repository = context.getBean(PersonRepository.class);
		Person person = repository.retrieve(id);
		return person.getAccount();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody ResponseEntity<Void> createPerson(){
		
		//adding Person code
		
		HttpHeaders headers = new HttpHeaders();

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

}
