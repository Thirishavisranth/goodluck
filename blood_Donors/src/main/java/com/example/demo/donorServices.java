package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class donorServices {
	
	@Autowired
	private donorRepo s;
	
	public donorEntity adddetails(donorEntity w)
	{
		return s.save(w);
	}
	
	public List<donorEntity> get_details(){
		
		List<donorEntity> arr =new ArrayList<>();
		arr=s.findAll();
		return arr;
	}
	
	public void deldetails(int id)
	{
		s.deleteById(id);
	}
	
	public donorEntity updatedetails(int id,donorEntity obj)
	{
		return s.saveAndFlush(obj);
	}

}
