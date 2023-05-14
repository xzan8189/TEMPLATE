package com.example.demo;

import com.example.demo.model.Utente;
import com.example.demo.mongorepository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UtenteRepository utenteRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		utenteRepository.deleteAll();

		// save a user
		Utente utente = new Utente();
		utente.setNameID("peppe");
		this.utenteRepository.save(utente);

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Utente user : utenteRepository.findAll()) {
			System.out.println(user);
		}
		System.out.println();
	}

}
