package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController

public class donorcontroller {

	@Autowired
	private donorServices s;
	
	@PostMapping("/add")  
	public donorEntity postTeacher(@RequestBody donorEntity Tea)
	{
		return s.adddetails(Tea);
	}
	
	@GetMapping("/show")
	public List<donorEntity> showTeacher()
	{
		List<donorEntity> a = new ArrayList<>();
		a = s.get_details();
		return a;
	}
	@DeleteMapping("/del/{id}")
	public String delTeacher(@PathVariable("id") int id) {
		s.deldetails(id);
		return "Susscessfully deleted";
	}

	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody donorEntity obj) {
		s.updatedetails(id, obj);
		return "Susscessfully updated";
	}
}
