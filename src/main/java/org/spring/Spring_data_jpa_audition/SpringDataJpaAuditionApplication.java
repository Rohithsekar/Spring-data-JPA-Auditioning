package org.spring.Spring_data_jpa_audition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringDataJpaAuditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaAuditionApplication.class, args);
	}

}
