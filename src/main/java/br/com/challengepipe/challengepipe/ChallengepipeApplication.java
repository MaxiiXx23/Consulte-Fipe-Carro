package br.com.challengepipe.challengepipe;

import br.com.challengepipe.challengepipe.views.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengepipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallengepipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Menu menuMain = new Menu();

		menuMain.showMenu();
	}
}
