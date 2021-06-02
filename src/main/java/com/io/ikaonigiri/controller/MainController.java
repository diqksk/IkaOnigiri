package com.io.ikaonigiri.controller;

import com.io.ikaonigiri.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    private LoginService loginService;

    @GetMapping("/")
    public String callMain(){
        System.out.println("여기는 인덱스입니다.");
        return "index";
    }


}
