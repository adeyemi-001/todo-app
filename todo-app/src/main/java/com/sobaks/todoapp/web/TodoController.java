package com.sobaks.todoapp.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//hosted on http://localhost:8080
@RestController
public class TodoController {
  
	 // i.e fetch the todo Items from the database
	 @GetMapping("/api/todoItems")
	 public ResponseEntity<?> fetchAllTodoItems (){
		 
		 
		 
		 
	 }
}
