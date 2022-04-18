package guru.springframework.norrisChuck;

import guru.springframework.norrisChuck.controllers.ChuckController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NorrisChuckApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(NorrisChuckApplication.class, args);
	}

}
