package com.io.ikaonigiri.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginRepository {
    Map<String, String> checkLogIn(String input_id);
}
