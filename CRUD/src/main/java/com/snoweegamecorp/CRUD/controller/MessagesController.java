package com.snoweegamecorp.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snoweegamecorp.CRUD.model.Messages;
import com.snoweegamecorp.CRUD.repository.MessagesRepository;

//RestController- set this class as a controller of endpoints, test with Postman
//RequestMapping- set a endpoint to access
//CrossOrigin- enable this endpoint to be accessed from everywhere
@RestController
@RequestMapping("/messages")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MessagesController {

	//Autowired- injects all dependencies from a repository(query methods)
	@Autowired
	private MessagesRepository repository;
	
	//GetMapping- this field will return some data
	//ResponseEntity- this method will send a json data on the body message of response
	@GetMapping
	public ResponseEntity<List<Messages>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
