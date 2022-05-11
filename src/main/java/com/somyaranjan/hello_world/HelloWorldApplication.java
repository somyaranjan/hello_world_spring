package com.somyaranjan.hello_world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String insert = "INSERT INTO test (name, age) VALUES (?, ?)";
		String view = "SELECT * FROM test";
		int result = jdbcTemplate.update(insert, "Soffgfg", 24);
		if(result >0) {
			System.out.println("data inserted");
		}
	}

}
