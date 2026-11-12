package com.sk.cuello.service;

import com.sk.cuello.entity.CuelloUser;
import com.sk.cuello.repository.CuelloUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuelloUserService {

    final CuelloUserRepository cuelloUserRepository;

    public CuelloUserService(CuelloUserRepository cuelloUserRepository) {
        this.cuelloUserRepository = cuelloUserRepository;
    }

    public void createUser(CuelloUser cuelloUser){
        cuelloUserRepository.save(cuelloUser);
    }

    public List<CuelloUser> findAllUsers() {
        return cuelloUserRepository.findAll();
    }
}
