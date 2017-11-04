package pl.akademiakodu.kwejk.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.projekt.model.Category;
import pl.akademiakodu.kwejk.projekt.repository.CategoryRepo;

/**
 * Created by arabk on 04.11.2017.
 */
@Controller
public class CategoryController {


    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/categories")
    public String mainGet(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryRepo.categories);
        return "categories";
    }

}
