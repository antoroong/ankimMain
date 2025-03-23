package org.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/thymelef")
public class ThymeleafExampleController {

    @GetMapping("/example")
    public String thymeleafExample(Model model){
    
        System.out.printf("타임레프 예제");
        model.addAttribute("message", "Hello, Thymeleaf!");
        model.addAttribute("items", List.of("사과", "바나나", "딸기"));
        model.addAttribute("isAdmin", true);
        return "example"; // example.html 템플릿을 반환
    }

}
