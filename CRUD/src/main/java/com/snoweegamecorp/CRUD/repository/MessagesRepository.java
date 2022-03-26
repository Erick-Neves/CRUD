package com.snoweegamecorp.CRUD.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.snoweegamecorp.CRUD.model.Messages;

//Repository- set this class to receive the querys methods
@Repository
public interface MessagesRepository extends JpaRepository<Messages, Long> {
	
	//Query to find all messages by title ignoring lower and uppercase
	public List<Messages> findAllByTitleContainingIgnoreCase(String title);

}
