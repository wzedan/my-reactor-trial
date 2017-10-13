package reactor.wz.learning.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class MyReactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyReactorApplication.class, args);	
	}
}
