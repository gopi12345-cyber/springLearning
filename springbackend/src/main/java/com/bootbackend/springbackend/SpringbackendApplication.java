package com.bootbackend.springbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bootbackend.springbackend.model.User;
import com.bootbackend.springbackend.repository.UserRepo;

@SpringBootApplication
public class SpringbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbackendApplication.class, args);
	}
    @Autowired
    private UserRepo userRepo;
    
	@Override
	public void run(String... args) throws Exception {
		this.userRepo.save(new User("Gopi","Putta","gopikishore777@gmaiol.com"));
		this.userRepo.save(new User("ramesh","bala","raneshgdvgd@gmaiol.com"));
		this.userRepo.save(new User("rakesh","motty","hjsbhkjaishore777@gmaiol.com"));
		
	}

}
