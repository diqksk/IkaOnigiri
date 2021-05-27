package com.io.ikaonigiri.controller;

import com.io.ikaonigiri.service.BoardService;
import com.io.ikaonigiri.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;


    @GetMapping("/signup")
    public String signUp(){
        return "signup";
    }

    @GetMapping("/write")
    public String write(){
        return "writeBoard";
    }

    @PostMapping("/write")
    public String writeBoard(@RequestParam Map<String,String> formValue){
        boardService.insertBoard(formValue);
        return "redirect:/ikaroom";
    }

    @GetMapping("/detail/{id}")
    public String callBoard(@PathVariable("id") int id,Model model){
        System.out.println(boardService.callBoard(id));
        model.addAttribute("list",boardService.callBoard(id));
        return "boardDetail";
    }

}
