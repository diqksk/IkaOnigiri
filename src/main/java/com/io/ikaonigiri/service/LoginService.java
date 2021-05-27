package com.io.ikaonigiri.service;

import java.util.List;
import java.util.Map;

public interface LoginService {
    Map<String, String> checkLogIn(String input_id);
    Map<String, String> checkSignUp(String input_text, String input_value);
    int signUp(Map<String,String> input_value);
}
