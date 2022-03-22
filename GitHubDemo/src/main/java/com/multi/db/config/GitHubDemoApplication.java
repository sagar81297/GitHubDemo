package com.multi.db.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubDemoApplication.class, args);
		System.out.println("Hello world! by sagar-1 branch");
	}

}
