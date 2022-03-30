package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FeedbackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackAppApplication.class, args);
	}
	
	@GetMapping("/giveFeedback")
	public String giveFeedback() {
		return "Giving Feedback";
	}

}
