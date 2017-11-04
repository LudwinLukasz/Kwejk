package pl.akademiakodu.kwejk.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.kwejk.projekt.repository.GifRepo;

/**
 * Created by arabk on 04.11.2017.
 */
@Controller
public class MainController {

    @Autowired
    GifRepo gifRepo;

    @GetMapping("/")
    public String mainGet(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifRepo.gifs);
        return "home";
    }

    @RequestMapping(value = "/aaa",method = RequestMethod.GET)
    public String search(@RequestParam("q") String q) {
        return "ala";
    }

}
