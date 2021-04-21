package com.customers.customer1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customers.customer1.model.User;
import com.customers.customer1.repository.UserRepository;

@SpringBootApplication
public class Customer1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Customer1Application.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Anu","Radha","anur@gmail.com"));
		this.userRepository.save(new User("Preetham","Singh","preethams@gmail.com"));
		this.userRepository.save(new User("Riya","K","riya@gmail.com"));
		this.userRepository.save(new User("Monisha","R","monishar@gmail.com"));
		this.userRepository.save(new User("Gopal","Sharma","sharmagopal@gmail.com"));
		this.userRepository.save(new User("Ankita","T","ankita01@gmail.com"));
		this.userRepository.save(new User("Rajeev","Shah","rajeev@gmail.com"));
		this.userRepository.save(new User("Supriya","Manoj","supriyamanoj@gmail.com"));
		this.userRepository.save(new User("suchi","Maria","mariasuchi@gmail.com"));
		this.userRepository.save(new User("Pankaj","Preet","pankaj@gmail.com"));
		
	}

}
