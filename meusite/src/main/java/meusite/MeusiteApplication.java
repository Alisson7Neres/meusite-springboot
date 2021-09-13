package meusite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
@EntityScan(basePackages = {"meusite.model"})
@ComponentScan(basePackages = {"meusite.controller", "meusite.service"})
@EnableJpaRepositories(basePackages = {"meusite.repository"})
@RestController
@EnableAutoConfiguration
public class MeusiteApplication{

	public static void main(String[] args) {
		SpringApplication.run(MeusiteApplication.class, args);
	}
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/contato/**")
		.allowedMethods("*")
		.allowedOrigins("*");
	}

}
