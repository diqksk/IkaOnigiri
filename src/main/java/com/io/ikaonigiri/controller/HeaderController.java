package com.io.ikaonigiri.controller;

import com.io.ikaonigiri.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HeaderController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/ikaroom")
    public String callIkaRoom(Model model){
        if(boardService.callBoards(1)!=null)
        model.addAttribute("lists",boardService.callBoards(1));
        return "room";
    }

    @GetMapping("/onigiriroom")
    public String callOnigiriRoom(Model model){
        if(boardService.callBoards(2)!=null)
            model.addAttribute("lists",boardService.callBoards(2));
        return "room";
    }

    @GetMapping("/login")
    public String callLogin(){
        return "login";
    }

    @GetMapping("/logout")
    public String callLogOut(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
