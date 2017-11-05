package pl.akademiakodu.kwejk.projekt.repository;

import pl.akademiakodu.kwejk.projekt.model.Category;
import pl.akademiakodu.kwejk.projekt.model.Gif;

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

    public List<Gif> allGifsByCategory(Category category) {
        List<Gif> catGif = new ArrayList<>();
        for (Gif gif : gifs
                ) {
            if (gif.getGifCategory().equals(category)) {
                catGif.add(gif);
            }
        }
        return catGif;
    }
}
