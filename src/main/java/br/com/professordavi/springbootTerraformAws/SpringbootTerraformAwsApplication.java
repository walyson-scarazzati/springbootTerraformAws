package br.com.professordavi.springbootTerraformAws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;

@SpringBootApplication
@EnableSqs
public class SpringbootTerraformAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTerraformAwsApplication.class, args);
	}

}
