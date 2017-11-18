package pl.akademiakodu.kwejk.projekt.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.kwejk.projekt.model.Gif;
import pl.akademiakodu.kwejk.projekt.model.manytoone.ModelCategory;
import pl.akademiakodu.kwejk.projekt.repository.CategoryCrudRepository;
import pl.akademiakodu.kwejk.projekt.repository.GifRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 04.11.2017.
 */
@Controller
public class CategoryController {
    @Autowired
    GifRepo gifRepo;

//    @Autowired
//    CategoryRepo categoryRepo;

    @Autowired
    CategoryCrudRepository categoryCrudRepository;

//    @GetMapping("/categories")
//    public String mainGet(ModelMap modelMap){
//        modelMap.addAttribute("categories", categoryRepo.categories);
//        return "categories";
//    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String searchByCat(ModelMap modelMap, @RequestParam(value = "q", required = false) String q) {
        if (StringUtils.isNotBlank(q)) {
            List<ModelCategory> searchCategory = new ArrayList<>();
            for (ModelCategory category : categoryCrudRepository.findAll()
                    ) {
                if (category.getName().contains(q)) {
                    searchCategory.add(category);
                }
            }
            modelMap.addAttribute("categories", searchCategory);
            return "categories";
        } else {
            modelMap.addAttribute("categories", categoryCrudRepository.findAll());
            return "categories";
        }
    }

    @GetMapping("/category/{id}")
    public String categoryGet(@PathVariable Long id, ModelMap modelMap) {
        modelMap.addAttribute("category", categoryCrudRepository.findById(id));
        modelMap.addAttribute("gifs", gifRepo.allGifsByCategory(categoryCrudRepository.findById(id)));
        //modelMap.addAttribute("gifs", gifRepo.gifs);
        return "category";
    }

    @RequestMapping(value = "/addCategory", method = RequestMethod.GET)
    public String addCategory(ModelMap modelMap, @RequestParam(value = "q", required = false) String q) {
        if (StringUtils.isNotBlank(q)) {
            categoryCrudRepository.save(new ModelCategory(q));
            return "redirect:/categories";
        } else {
            return "newCategoryForm";
        }
    }
}
