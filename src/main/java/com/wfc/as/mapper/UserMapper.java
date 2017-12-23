package com.wfc.as.mapper;

import com.wfc.as.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id, name from user where id=#{0}")
    User getById(Integer id);
}
