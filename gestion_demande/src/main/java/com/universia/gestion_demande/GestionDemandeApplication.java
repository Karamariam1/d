package com.universia.gestion_demande;

import com.universia.gestion_demande.entities.Client;
import com.universia.gestion_demande.dao.ClientDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GestionDemandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDemandeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ClientDao clientRepository) {
		return args -> {
			clientRepository.save(Client.builder()
					.nom("Ali")
					.adresse("Casablanca")
					.tele(123456789)
					.build());

			clientRepository.save(Client.builder()
					.nom("Fatima")
					.adresse("Rabat")
					.tele(987654321)
					.build());

			clientRepository.save(Client.builder()
					.nom("Youssef")
					.adresse("Fes")
					.tele(567890123)
					.build());

			System.out.println("Clients ajoutés avec succès !");
		};
	}
}
