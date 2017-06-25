package no.nav.eessi.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
Bruk av web+camel
https://dzone.com/articles/how-to-integrate-spring-boot-and-apache-camel

http://www.kai-waehner.de/blog/2012/05/04/apache-camel-tutorial-introduction/
*/


@SpringBootApplication
public class CamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelApplication.class, args);
	}
}
