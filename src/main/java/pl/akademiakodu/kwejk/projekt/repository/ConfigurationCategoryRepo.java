package pl.akademiakodu.kwejk.projekt.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akademiakodu.kwejk.projekt.model.Category;

/**
 * Created by arabk on 04.11.2017.
 */
@Configuration
public class ConfigurationCategoryRepo {

    @Bean
    public CategoryRepo categoryRepo(){
        CategoryRepo categoryRepo = new CategoryRepo();
        categoryRepo.addCategory(new Category(1L,"mems"));
        categoryRepo.addCategory(new Category(2L,"android"));
        categoryRepo.addCategory(new Category(3L,"sport"));
        categoryRepo.addCategory(new Category(4L,"funny"));
        return categoryRepo;
    }


}
