package pl.akademiakodu.kwejk.projekt.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akademiakodu.kwejk.projekt.model.Category;
import pl.akademiakodu.kwejk.projekt.model.Gif;

/**
 * Created by arabk on 04.11.2017.
 */
@Configuration
public class ConfigurationGifRepo {

    @Bean
    public GifRepo gifRepo(){
        GifRepo gifRepo = new GifRepo();
        gifRepo.addGif(new Gif("ben-and-mike",false));
        gifRepo.addGif(new Gif("android-explosion",true));
        gifRepo.addGif(new Gif("book-dominos",false));
        gifRepo.addGif(new Gif("compiler-bot",true));
        gifRepo.addGif(new Gif("cowboy-coder",false));
        gifRepo.addGif(new Gif("infinite-andrew",false));
        return gifRepo;
    }

}
