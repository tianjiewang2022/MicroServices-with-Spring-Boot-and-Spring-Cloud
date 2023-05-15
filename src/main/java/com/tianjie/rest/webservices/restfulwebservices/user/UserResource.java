package com.tianjie.rest.webservices.restfulwebservices.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	private UserDaoService service;
	public UserResource(UserDaoService service) {
		this.service = service;
	}
	
	// Get /users
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
	//http://localhost:8080/users
	
	//EntityModel
	//WebMvcLinkBuilder
	
	// Get /users
	@GetMapping("/users/{id}")
	public EntityModel<User> retriveUsers(@PathVariable int id){
		User user = service.findOne(id);
		
		if(user == null)
			throw new UserNotFoundException("id: " + id);
		EntityModel<User> entityModel = EntityModel.of(user);
		
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retriveAllUsers());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
				
	}
	//POST / users
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);
		
		// /users/4 => /users/{id}, user.getId
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri(); 
		// location - /users/4
		
		return ResponseEntity.created(location).build();
	}
	
	// Delete / users
	@DeleteMapping("/users/{id}")
	public void deleteUsers(@PathVariable int id){
		service.deleteById(id);	
	}
	
}
