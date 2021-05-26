package com.io.ikaonigiri.controller;

import com.io.ikaonigiri.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    private BoardService boardService;

    @GetMapping("/signup")
    public String signUp(){
        return "signup";
    }
<<<<<<< HEAD

=======
>>>>>>> af794a8 (signUp 구현)


}
