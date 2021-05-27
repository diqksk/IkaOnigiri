package com.io.ikaonigiri.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginRepository {
    Map<String, Object> checkLogIn(String input_id);
    Map<String, String> checkSignUp(String input_text, String input_value);
    int signUp(Map<String,String> input_value);

}
