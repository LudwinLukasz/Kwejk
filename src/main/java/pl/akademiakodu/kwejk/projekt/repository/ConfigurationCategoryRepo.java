package pl.akademiakodu.kwejk.projekt.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akademiakodu.kwejk.projekt.model.Gif;
import pl.akademiakodu.kwejk.projekt.model.manytoone.ModelCategory;

/**
 * Created by arabk on 04.11.2017.
 */
@Configuration
public class ConfigurationCategoryRepo {

//    @Bean
//    public CategoryRepo categoryRepo(){
//        CategoryRepo categoryRepo = new CategoryRepo();
//        categoryRepo.addCategory(new Category(1L,"mems"));
//        categoryRepo.addCategory(new Category(2L,"android"));
//        categoryRepo.addCategory(new Category(3L,"sport"));
//        categoryRepo.addCategory(new Category(4L,"funny"));
//        return categoryRepo;
//    }


//    @Bean
//    public GifRepo gifRepo(CategoryRepo categoryRepo){
//        GifRepo gifRepo = new GifRepo();
//        gifRepo.addGif(new Gif("ben-and-mike",false,categoryRepo.findByName("mems")));
//        gifRepo.addGif(new Gif("android-explosion",true,categoryRepo.findByName("android")));
//        gifRepo.addGif(new Gif("book-dominos",false,categoryRepo.findByName("mems")));
//        gifRepo.addGif(new Gif("compiler-bot",true,categoryRepo.findByName("sport")));
//        gifRepo.addGif(new Gif("cowboy-coder",false,categoryRepo.findByName("mems")));
//        gifRepo.addGif(new Gif("infinite-andrew",false,categoryRepo.findByName("funny")));
//        return gifRepo;
//    }
    @Autowired
    CategoryCrudRepository categoryCrudRepository;

    @Bean
    public GifRepo gifRepo(){
        categoryCrudRepository.save(new ModelCategory(1L, "mems"));
        categoryCrudRepository.save(new ModelCategory(2L, "android"));
        categoryCrudRepository.save(new ModelCategory(3L, "sport"));
        categoryCrudRepository.save(new ModelCategory(4L, "funny"));
        GifRepo gifRepo = new GifRepo();
        gifRepo.addGif(new Gif("ben-and-mike",false, categoryCrudRepository.findById(1L)));
        gifRepo.addGif(new Gif("android-explosion",true,categoryCrudRepository.findByName("android")));
        gifRepo.addGif(new Gif("book-dominos",false,categoryCrudRepository.findByName("mems")));
        gifRepo.addGif(new Gif("compiler-bot",true,categoryCrudRepository.findByName("sport")));
        gifRepo.addGif(new Gif("cowboy-coder",false,categoryCrudRepository.findByName("mems")));
        gifRepo.addGif(new Gif("infinite-andrew",false,categoryCrudRepository.findByName("funny")));
        return gifRepo;
    }
}
