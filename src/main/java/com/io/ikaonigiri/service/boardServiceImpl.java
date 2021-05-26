package com.io.ikaonigiri.service;

import com.io.ikaonigiri.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class boardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Map<String, String>> callBoards(int board_no) {
        return boardRepository.callBoards(board_no);
    }

    @Override
    public Map<String, String> callBoard(int id, int board_no) {
        return null;
    }

    @Override
    public int deleteBoard(int id) {
        return 0;
    }

    @Override
    public int updateBoard(Map<String, String> value) {
        return 0;
    }
}
