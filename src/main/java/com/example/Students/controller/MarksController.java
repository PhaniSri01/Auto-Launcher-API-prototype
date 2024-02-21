package com.example.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Students.entity.Marks;
import com.example.Students.service.MarksService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@Controller
@RequestMapping("/marks-data")
public class MarksController {
	
	@Autowired
	private MarksService marksService;
	
	@Operation(summary = "Fetches all the marks data")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success"),
			@ApiResponse(responseCode = "401", description = "Unauthorised"),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error")
	})
	@GetMapping("/marks")
	public @ResponseBody Iterable<Marks> getMarks(){
//		System.out.println("Response: "+ marksService.getMarks());
		return marksService.getMarks();
	}
	
	@Operation(summary = "Fetches all the marks data by roll")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success"),
			@ApiResponse(responseCode = "401", description = "Unauthorised"),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error")
	})
	@GetMapping("/{roll}")
	public @ResponseBody Marks getMarksById(@PathVariable Long roll) {
//		System.out.println("Response from service class: "+ marksService.getMarksById(roll));
		return marksService.getMarksById(roll);
	}

}
