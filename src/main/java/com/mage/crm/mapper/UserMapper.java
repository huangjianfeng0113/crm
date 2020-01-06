package com.mage.crm.mapper;


import com.mage.crm.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user where is_valid = 1")
    List<User> findAll();

    @Update("update t_user set true_name = #{trueName} where id = #{userId}")
    void updateTrueName(String trueName, Integer userId);
}
