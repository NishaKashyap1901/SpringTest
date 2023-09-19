package SpringTest.Inno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnoApplication.class, args);
		ApplicationContext context =SpringApplication.run(InnoApplication.class, args);


		Shape circle = context.getBean(Circle.class);
		System.out.println("Circle Area: " + circle.calculateArea());


	}

}
