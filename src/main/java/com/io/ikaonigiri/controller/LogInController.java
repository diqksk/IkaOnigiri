package com.io.ikaonigiri.controller;

import com.io.ikaonigiri.service.BoardService;
import com.io.ikaonigiri.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class LogInController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String checkLogIn(@RequestBody Map<String, String> login_values, HttpServletRequest request) {
        String id = login_values.get("id");
        String password = login_values.get("password");
        System.out.println(loginService.checkLogIn(id));

        if (loginService.checkLogIn(id) == null) {
            return "id";
        } else if (!loginService.checkLogIn(id).get("password").equals(password)) {
            return "password";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("id", loginService.checkLogIn(id).get("nickname"));
            return "login";
        }
    }

    @PostMapping("/check-signup")
    public String checkSignUP(@RequestBody Map<String, String> signUpValues) {
        String id = signUpValues.get("id");
        String nickname = signUpValues.get("nickname");
        String email = signUpValues.get("email");

        if (loginService.checkSignUp("user_id", id) != null) {
            return "id";
        } else if (loginService.checkSignUp("nickname", nickname) != null) {
            return "nickname";
        } else if (loginService.checkSignUp("email", email) != null) {
            return "email";
        } else {
            loginService.signUp(signUpValues);
            return "ok";
        }
    }
}
