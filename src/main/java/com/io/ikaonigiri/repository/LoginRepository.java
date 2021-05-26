package com.io.ikaonigiri.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginRepository {
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
