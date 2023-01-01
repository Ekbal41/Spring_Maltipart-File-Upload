package com.asifekbal.fileupload.HomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.asifekbal.fileupload.Repository.NameRepository;


@Controller
public class MvcController {
    @Autowired
    private NameRepository nameRepo;
    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("names", nameRepo.findAll());

        return "hometemplate";
    }
   
}
