package org.infraction;

import org.infraction.dao.entities.Infraction;
import org.infraction.dao.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InfractionApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfractionApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InfractionRepository infractionRepository){
        return args -> {
            //infractionRepository.save(new Infraction(""))
        };
    }
}
