package com.u3coding.demo.mapper;

import com.u3coding.demo.entity.Users;

import java.util.List;
public interface UsersMapper {
    List<Users> findAll();
    Users findOne();
}
