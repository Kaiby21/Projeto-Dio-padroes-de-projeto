package one.digitalInovation.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabDigitalInovationPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDigitalInovationPatternsApplication.class, args);
	}

}
