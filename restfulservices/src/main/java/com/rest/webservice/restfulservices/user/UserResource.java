package com.rest.webservice.restfulservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDao service;
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return service.findall();
	}
	/* method without hateos @GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) throws UserNotFoundException
	{
		User user=service.findbyId(id);
		//Optional<User> user_opt=Optional.of(user);
		if(user==null)
		{
			throw new UserNotFoundException("User Id - "+id+" is not present");
		}
		return user;
	}*/
	@GetMapping("/users/{id}")
	public EntityModel<User> getUser(@PathVariable int id) throws UserNotFoundException
	{
		User user=service.findbyId(id);
		EntityModel<User> model=EntityModel.of(user);
		WebMvcLinkBuilder linktousers=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getUsers());
		//Optional<User> user_opt=Optional.of(user);
		model.add(linktousers.withRel("all-users"));
		if(user==null)
		{
			throw new UserNotFoundException("User Id - "+id+" is not present");
		}
		return model;
	}
	@PostMapping("/users")
	public ResponseEntity<Object>  AddUser(@Valid @RequestBody User user)
	{
		User savedUser=service.save(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		//return ResponseEntity.created(location).build();
		return ResponseEntity.status(HttpStatus.CREATED).location(location).build();
	}
	@DeleteMapping("/users/{id}")
	public User deleteUser(@PathVariable int id) throws UserNotFoundException
	{
		User user=service.findbyId(id);
		//Optional<User> user_opt=Optional.of(user);
		if(user==null)
		{
			throw new UserNotFoundException("User Id - "+id+" is not present");
		}
		else
		{
			service.deleteById(id);
		}
		return user;
	}
}
