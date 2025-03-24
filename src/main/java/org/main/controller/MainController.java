package org.main.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.main.entity.User;
import org.main.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MainController {


    @GetMapping("/")
    public String main(Model model, HttpServletRequest request){

        System.out.println("main 옴");

        System.out.println("소희야 contextPath : "+request.getContextPath());

        return "index"; // example.html 템플릿을 반환
    }

}
