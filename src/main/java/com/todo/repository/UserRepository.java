package com.todo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.todo.beans.UserBean;

@Mapper
public interface UserRepository {
    public UserBean identifyUser(String user_name);

}
