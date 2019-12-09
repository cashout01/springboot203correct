package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/song2form")
    public String loadFormPage (Model model){
        model.addAttribute( s: "song2", new Song2());
        return "song2form";

    }
    @PostMapping("/song2form")
    public String loadFromPage (@ModelAttribute Song2 song2,
                                Model model) {
        model.addAttribute("song2", Song2);
        return "confirmsong2";
    }
}
