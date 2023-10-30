package br.com.appesports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AppEsportsApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppEsportsApplication.class, args);
	}
}
