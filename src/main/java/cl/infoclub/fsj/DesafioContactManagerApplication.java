package cl.infoclub.fsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=DesafioContactManagerApplication.class)
public class DesafioContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioContactManagerApplication.class, args);
	}

}
