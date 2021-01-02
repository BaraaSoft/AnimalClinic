package com.baraabytes.animalclinicweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController  {


    @RequestMapping({"/","","index.html","index"})
    public String index(Model model){
        model.addAttribute("greating","Hello Animal Clinic App");
        return "index";
    }
}
