package pl.akademiakodu.kwejk.projekt.model;

import org.springframework.stereotype.Component;

/**
 * Created by arabk on 04.11.2017.
 */
@Component
public class Gif {

   public String name;
   public  Boolean favorite;
    public Gif() {}
    public Gif(String name, Boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

}
