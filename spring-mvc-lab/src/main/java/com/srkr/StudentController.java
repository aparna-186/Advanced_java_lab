package com.srkr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/display")
    public String display(
            @RequestParam("name") String name,
            @RequestParam("branch") String branch,
            Model model) {

        Student student = new Student(name, branch);

        model.addAttribute("student", student);

        return "result";
    }
}