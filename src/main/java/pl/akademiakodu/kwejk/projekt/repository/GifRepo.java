package pl.akademiakodu.kwejk.projekt.repository;

import pl.akademiakodu.kwejk.projekt.model.Gif;
import pl.akademiakodu.kwejk.projekt.model.manytoone.ModelCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 04.11.2017.
 */
public class GifRepo {

    public List<Gif> gifs = new ArrayList<>();
    public void addGif(Gif gif) {
        gifs.add(gif);
    }

    public List<Gif> allGifsByCategory(ModelCategory category) {
        List<Gif> catGif = new ArrayList<>();
        for (Gif gif : gifs
                ) {
            System.out.println(category);
            System.out.println(gif);
            if (category.equals(gif.getGifCategory())) {
                catGif.add(gif);
            }
        }
        return catGif;
    }
}
