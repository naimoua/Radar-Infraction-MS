package org.radar;

import org.radar.dao.entities.Radar;
import org.radar.dao.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class RadarApplication {


    public static void main(String[] args) {

        SpringApplication.run(RadarApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RadarRepository radarRepository){
        return(args -> {

            Radar client = Radar.builder()
                    .id("1")
                    .max_velocity(80)
                    .longitude(40.714)
                    .latitude(-74.006)
                    .build();
            radarRepository.save(client);

        });

    }

}