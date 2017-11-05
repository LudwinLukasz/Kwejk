package pl.akademiakodu.kwejk.projekt.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akademiakodu.kwejk.projekt.model.Category;
import pl.akademiakodu.kwejk.projekt.model.Gif;

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


    @Bean
    public GifRepo gifRepo(CategoryRepo categoryRepo){
        GifRepo gifRepo = new GifRepo();
        gifRepo.addGif(new Gif("ben-and-mike",false,categoryRepo.findByName("mems")));
        gifRepo.addGif(new Gif("android-explosion",true,categoryRepo.findByName("android")));
        gifRepo.addGif(new Gif("book-dominos",false,categoryRepo.findByName("mems")));
        gifRepo.addGif(new Gif("compiler-bot",true,categoryRepo.findByName("sport")));
        gifRepo.addGif(new Gif("cowboy-coder",false,categoryRepo.findByName("mems")));
        gifRepo.addGif(new Gif("infinite-andrew",false,categoryRepo.findByName("funny")));
        return gifRepo;
    }

}
