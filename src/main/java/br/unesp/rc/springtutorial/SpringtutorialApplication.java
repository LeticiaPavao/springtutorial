package br.unesp.rc.springtutorial;

import br.unesp.rc.springtutorial.entity.Fisica;
import br.unesp.rc.springtutorial.utils.InstanceGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringtutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringtutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Fisica entity = InstanceGenerator.getPessoaFisica("111.222.333-44","user1");
		System.out.println("\n" + entity + "\n");
	}

}
