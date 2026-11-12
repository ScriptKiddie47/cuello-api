package com.sk.cuello.controller;

import com.sk.cuello.entity.CuelloUser;
import com.sk.cuello.service.CuelloUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuello/api/v1/user")
public class CuelloUserController {

    final CuelloUserService cuelloUserService;

    public CuelloUserController(CuelloUserService cuelloUserService) {
        this.cuelloUserService = cuelloUserService;
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(@RequestBody CuelloUser cuelloUser){
        cuelloUserService.createUser(cuelloUser);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllUsers(){
        List<CuelloUser> cuelloUserList = cuelloUserService.findAllUsers();
        return new ResponseEntity<>(cuelloUserList,HttpStatus.CREATED);
    }
}
