package com.example.springdb;

import com.example.springdb.entity.User;
import com.example.springdb.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringdbApplication {

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringdbApplication.class, args);
	}


	@PostMapping("/save-users")
	public User saveUser(@RequestBody User user){
		return userRepo.save(user);

	}

	@GetMapping("/get-users")
	public List<User> getUsers(){
		return userRepo.findAll();
	}

	@GetMapping("/hello")
	public String getMessage(){
		return "Hi from spring boot user";
	}

}
