package com.io.ikaonigiri.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
    List<Map<String,String>> callBoards(int board_no);
    Map<String,String> callBoard(int id,int board_no);
    int deleteBoard(int id);
    int updateBoard(Map<String, String> value);
}
