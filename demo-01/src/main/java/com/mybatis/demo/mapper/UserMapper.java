package com.mybatis.demo.mapper;

import com.mybatis.demo.domain.User;

public interface UserMapper {

    User selectUser(Long id);
}
