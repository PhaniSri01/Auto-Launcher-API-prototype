package com.example.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Students.entity.Marks;
import com.example.Students.service.MarksService;

@Controller
@RequestMapping("/marks-data")
public class MarksController {
	
	@Autowired
	private MarksService marksService;
	
	@GetMapping("/marks")
	public @ResponseBody Iterable<Marks> getMarks(){
//		System.out.println("Response: "+ marksService.getMarks());
		return marksService.getMarks();
	}
	
	@GetMapping("/{roll}")
	public @ResponseBody Marks getMarksById(@PathVariable Long roll) {
//		System.out.println("Response from service class: "+ marksService.getMarksById(roll));
		return marksService.getMarksById(roll);
	}

}
