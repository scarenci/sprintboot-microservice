package com.example.demo.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //Passando para o yml
public class ApiGatewayConfiguration {

	/*@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/get")
							.filters(f -> f
								.addRequestHeader("Hello", "World")
								.addRequestParameter("Hello", "World"))
						.uri("http://httpbin.org:80"))
				.route(p -> p.path("/catalog-microservice/**")
						.uri("lb://catalog-microservice"))
				.route(p -> p.path("/shopping-microservice/**")
						.uri("lb://shopping-microservice"))
				.build();
	}*/
}
