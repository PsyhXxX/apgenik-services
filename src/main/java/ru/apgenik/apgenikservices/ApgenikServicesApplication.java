package ru.apgenik.apgenikservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.apgenik.apgenikservices.entity.Customer;
import ru.apgenik.apgenikservices.repository.CustomerRepository;

@SpringBootApplication
public class ApgenikServicesApplication {

	private static final Logger log = LoggerFactory.getLogger(ApgenikServicesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ApgenikServicesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository){
		return (args) -> {
			repository.save(new Customer("Homer", "Simpson"));
		};
	}
}
