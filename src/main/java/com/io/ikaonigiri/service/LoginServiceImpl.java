package com.io.ikaonigiri.service;

import com.io.ikaonigiri.repository.BoardRepository;
import com.io.ikaonigiri.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Map<String, String> checkLogIn(String input_id) {
        return loginRepository.checkLogIn(input_id);
    }
}
