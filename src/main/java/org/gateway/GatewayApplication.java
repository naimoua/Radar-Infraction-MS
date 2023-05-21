package org.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

   @Bean
    RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route((r) -> r.path("/owners/**").uri("http://localhost:8081/"))
                .route((r) -> r.path("/vehicles/**").uri("http://localhost:8081/"))
                .route((r) -> r.path("/infractions/**").uri("http://localhost:8181/"))
                .route((r) -> r.path("/radars/**").uri("http://localhost:8082/"))
                .build();
    }
    /*@Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties properties){
        return new DiscoveryClientRouteDefinitionLocator(rdc , properties);
    }*/
}
