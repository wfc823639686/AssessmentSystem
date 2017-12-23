package com.wfc.as.mapper;

import com.wfc.as.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name, account, password, createTime) values (" +
            "#{name}, #{account}, #{password}, #{createTime})")
    int insert(User user);

    @Select("select id, name from user where id=#{0}")
    User getById(Integer id);
}
