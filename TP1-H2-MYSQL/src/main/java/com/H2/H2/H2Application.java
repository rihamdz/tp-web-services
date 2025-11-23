package com.H2.H2;

import com.H2.H2.entity.Adherent;
import com.H2.H2.repository.AdherentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2Application {

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

    @Bean
    CommandLineRunner run(AdherentRepository adherentRepository) {
        return args -> {
            adherentRepository.save(new Adherent(null, "riham", "Algerie", 22));
            adherentRepository.save(new Adherent(null, "ali", "Tunisie", 30));
            adherentRepository.save(new Adherent(null, "sara", "Maroc", 25));
        };
    }
}
