package com.io.ikaonigiri.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardRepository {
    List<Map<String,String>> callBoards(int board_no);
    Map<String,String> callBoard(int id);
    int insertBoard(Map<String,String> value);
    int deleteBoard(int id);
    int updateBoard(Map<String, String> value);
}
