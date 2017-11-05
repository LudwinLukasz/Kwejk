package pl.akademiakodu.kwejk.projekt.model;

import org.springframework.stereotype.Component;

/**
 * Created by arabk on 04.11.2017.
 */
@Component
public class Gif {

   public String name;
   public  Boolean favorite;
   public Category gifCategory;

    public Gif() {}
    public Gif(String name, Boolean favorite, Category category) {
        this.name = name;
        this.favorite = favorite;
        this.gifCategory = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Category getGifCategory() {
        return gifCategory;
    }

    public void setGifCategory(Category gifCategory) {
        this.gifCategory = gifCategory;
    }
}
