package com.itcodes.myhub.oracleconne.dao;

import com.itcodes.myhub.oracleconne.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserDao
 * @Author sussen
 * @Version 1.0
 * @Data 2020/1/9
 */
@Component
@Mapper
public interface UserDao {
    List<User> findByStatus();
}
