package pl.akademiakodu.kwejk.projekt.repository;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.projekt.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 04.11.2017.
 */
public class CategoryRepo {

    public List<Category> categories = new ArrayList<>();

    public void addCategory(Category category) {
        categories.add(category);
    }


}
