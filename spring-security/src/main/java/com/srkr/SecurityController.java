package com.srkr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Login successful!");
        return "home";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("message", "Admin access granted!");
        return "home";
    }
}