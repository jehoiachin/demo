package com.u3coding.demo.controller;

import com.u3coding.demo.entity.Users;
import com.u3coding.demo.mapper.UsersMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/reset/users")
public class UsersController {
    private UsersMapper usersMapper;
    public UsersController(UsersMapper mapper){
        this.usersMapper = mapper;
    }
    @GetMapping("/all")
    public List<Users> getAll(){
        return  usersMapper.findAll();
    }
    @GetMapping("/one")
    public Users getone(){
        return  usersMapper.findOne();
    }
}
