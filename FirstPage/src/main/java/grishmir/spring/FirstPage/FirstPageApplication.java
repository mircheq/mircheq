package grishmir.spring.FirstPage;

import Controller.UsersController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = UsersController.class)
public class FirstPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstPageApplication.class, args);
	}

}
