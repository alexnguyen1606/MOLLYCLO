package com.molly.service.impl;

import com.molly.dto.UserDTO;

import com.molly.repository.UserRepository;
import com.molly.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository ;

    @Override
    public List<UserDTO> findAll(Pageable pageable) {

        return null;
    }
}
