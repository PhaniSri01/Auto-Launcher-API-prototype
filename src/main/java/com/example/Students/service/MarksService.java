package com.example.Students.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Students.entity.Marks;
import com.example.Students.repository.MarksDataRepository;

@Service
public class MarksService {

	@Autowired
	private MarksDataRepository marksDataRepository;
	
	public Iterable<Marks> getMarks(){
//		System.out.println("Response in service: "+ marksDataRepository.findAll());
		return marksDataRepository.findAll();
	}
	
	public Marks getMarksById(Long roll) {
		Optional<Marks> md = marksDataRepository.findById(roll);
//		System.out.println("Crud response: "+ md);
		Marks res = null;
		if(md.isPresent()) {
			res = md.get();
		}
		return res;
	}
}
