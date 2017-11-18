package pl.akademiakodu.kwejk.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import pl.akademiakodu.kwejk.projekt.model.manytoone.ModelCategory;
import pl.akademiakodu.kwejk.projekt.repository.CategoryCrudRepository;

@SpringBootApplication
//@ComponentScan({"pl/akademiakodu/kwejk/projekt/controller", "pl/akademiakodu/kwejk/projekt/model"})
public class ProjektApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektApplication.class, args);
	}

	@Autowired
	CategoryCrudRepository categoryCrudRepository;

//	@Bean
//	@Transactional
//	public CommandLineRunner demo(CategoryCrudRepository categoryCrudRepository) {
//		return (args) -> {
//
//			categoryCrudRepository.save(new ModelCategory(1L, "mems"));
//			categoryCrudRepository.save(new ModelCategory(2L, "android"));
//			categoryCrudRepository.save(new ModelCategory(3L, "sport"));
//			categoryCrudRepository.save(new ModelCategory(4L, "funny"));
//
//
//		};
//	}
}
