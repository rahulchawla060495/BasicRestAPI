package com.rest.webservice.restfulservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;
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
public class PostJpaResource {
	@Autowired
	private UserDao service;
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private PostRepository prep;
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> getUserPosts(@PathVariable int id) throws UserNotFoundException
	{
		Optional<User> user=repo.findById(id);
		
		//Optional<User> user_opt=Optional.of(user)
		if(!user.isPresent())
		{
			throw new UserNotFoundException("User Id - "+id+" is not present");
		}
		else
		{
		return user.get().getPosts();
		}
		//return null;
	}
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Object>  creatPost(@PathVariable int id,@RequestBody Post post) throws UserNotFoundException
	{
     Optional<User> user_optional=repo.findById(id);
		
		//Optional<User> user_opt=Optional.of(user)
		if(!user_optional.isPresent())
		{
			throw new UserNotFoundException("User Id - "+id+" is not present");
		}
		else
		{
			User user=user_optional.get();
			post.setUser(user);
		    prep.save(post);
		}
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId()).toUri();
		//return ResponseEntity.created(location).build();
		return ResponseEntity.status(HttpStatus.CREATED).location(location).build();
	}
//	@DeleteMapping("/jpa/users/{id}")
//	public User deleteUser(@PathVariable int id) throws UserNotFoundException
//	{
//		Optional<User> user=repo.findById(id);
//		//Optional<User> user_opt=Optional.of(user);
//		if(!user.isPresent())
//		{
//			throw new UserNotFoundException("User Id - "+id+" is not present");
//		}
//		else
//		{
//			repo.deleteById(id);
//		}
//		return user.get();
//	}
}
