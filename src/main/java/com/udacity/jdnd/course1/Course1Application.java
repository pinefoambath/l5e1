package com.udacity.jdnd.course1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Course1Application {

	public Integer number;

	public static void main(String[] args) {
		SpringApplication.run(Course1Application.class, args);
	}

	public String fizzBuzz(int number) {
		if (number < 1) {
			throw new IllegalArgumentException("Value must be greater than 0");
		} else if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return "" + number;
		}
	}
}


