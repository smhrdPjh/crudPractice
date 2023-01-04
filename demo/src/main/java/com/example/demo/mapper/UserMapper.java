package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.UserVO;



@Mapper
public interface UserMapper {
    

    @Select("select * from users")
    List<UserVO> userList();
    
    @Select("select * from users where id=#{id}")
    UserVO fetchUserByID(int id);  

    @Insert("INSERT INTO users(username, password, firstName, lastName, age, salary) VALUES(#{username}, #{password}, #{firstName}, #{lastName}, #{age}, #{salary})")
    int insertUser(UserVO user);

    @Delete(" DELETE FROM users WHERE id = #{id}")
    int deleteUser(int id);

    @Update("update users set firstName = #{firstName}, lastName = #{lastName}, age = #{age}, salary = #{salary} WHERE id = #{id}")
    int updateUser(UserVO user);

}
