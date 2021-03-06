package com.luv2code.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
		
	@GetMapping("/")
	public String sayHello() {
		
		return "Hellow World! Time on server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		
		return "Run a har 5k!";
		}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		
		return "Today is your lucky day.";
		}

	@GetMapping("/avventura")
	public String getDailyFortune() {
		
		return "Git e Heroku sono fantastici !!!!!";
		}
	
}
