package com.ADO06.ADO06;

import com.ADO06.ADO06.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ado06Application {
	@Autowired
	private AlunosRepository alunosRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ado06Application.class, args);
	}

}
