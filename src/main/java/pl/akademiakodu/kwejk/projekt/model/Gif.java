package pl.akademiakodu.kwejk.projekt.model;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.projekt.model.manytoone.ModelCategory;

/**
 * Created by arabk on 04.11.2017.
 */
@Component
public class Gif {

   public String name;
   public  Boolean favorite;
   public ModelCategory gifCategory;

    public Gif() {}
    public Gif(String name, Boolean favorite, ModelCategory category) {
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

    public ModelCategory getGifCategory() {
        return gifCategory;
    }

    public void setGifCategory(ModelCategory gifCategory) {
        this.gifCategory = gifCategory;
    }

    @Override
    public String toString() {
        return "Gif{" +
                "name='" + name + '\'' +
                ", favorite=" + favorite +
                ", gifCategory=" + gifCategory +
                '}';
    }
}
