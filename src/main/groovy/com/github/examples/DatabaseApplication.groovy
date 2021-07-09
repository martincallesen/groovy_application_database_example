package com.github.examples

import com.github.examples.domain.Account
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DatabaseApplication {
	Logger log = LoggerFactory.getLogger(DatabaseApplication.class)

	static void main(String... args) {
		SpringApplication.run(DatabaseApplication, args)
	}

	@Bean
	CommandLineRunner demo(AccountRepository repository) {
		(args) -> {
			// save a few accounts
			repository.save(DataGenerator.generateRandomAccount())

			// fetch all customers
			log.info("Accounts found with findAll():")
			log.info("-------------------------------")
			for (Account account : repository.findAll()) {
				log.info(account.toString())
			}

			log.info("")
		}
	}
}
