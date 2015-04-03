package git.lambda.spring.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Task2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Task2");
	}

}
