package pl.akademiakodu.kwejk.projekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"pl/akademiakodu/kwejk/projekt/controller", "pl/akademiakodu/kwejk/projekt/model"})
public class ProjektApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektApplication.class, args);
	}
}
