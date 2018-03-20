package com.fd.javaspringemail.controllers;

import com.fd.javaspringemail.dto.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(path = {"/"})
    public String showHomePage(Model model) {
        model.addAttribute("email", new EmailDTO());
        return "index";
    }
}
