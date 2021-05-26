package com.io.ikaonigiri.service;

import java.util.List;
import java.util.Map;

public interface LoginService {
    Map<String, String> checkLogIn(String input_id);
<<<<<<< HEAD
<<<<<<< HEAD
    Map<String, String> checkSignUp(String input_text, String input_value);
    int signUp(Map<String,String> input_value);
=======
>>>>>>> cf13451 (List/Login/LogOut 구현)
=======
    Map<String, String> checkSignUp(String input_text, String input_value);
    int signUp(Map<String,String> input_value);
>>>>>>> af794a8 (signUp 구현)
}
