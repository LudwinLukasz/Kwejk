package pl.akademiakodu.kwejk.projekt.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.kwejk.projekt.model.Gif;
import pl.akademiakodu.kwejk.projekt.repository.GifRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 04.11.2017.
 */
@Controller
public class MainController {

    @Autowired
    GifRepo gifRepo;

//    @GetMapping("/")
//    public String mainGet(ModelMap modelMap){
//        modelMap.addAttribute("gifs",gifRepo.gifs);
//        return "home";
//    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String search(ModelMap modelMap, @RequestParam(value = "q",required = false) String q) {
        if (StringUtils.isNotBlank(q)) {
            List<Gif> searchGifs = new ArrayList<>();
            for (Gif gif:gifRepo.gifs
                 ) {
                if(gif.name.contains(q)) {
                    searchGifs.add(gif);
                }
            }
            modelMap.addAttribute("gifs",searchGifs);
            return "home";
        } else {
            modelMap.addAttribute("gifs",gifRepo.gifs);
            return "home";
        }

    }

}
