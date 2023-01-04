package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserVO;

@Service
public class UserService {

    private final UserMapper userMapper ;

    @Autowired
     public UserService(UserMapper usermapper){
        this.userMapper = usermapper;
    }

    public List<UserVO> userList(){


        return userMapper.userList();

    }

    public String insertUser(UserVO user){

        int result = userMapper.insertUser(user);

        if(result ==1){
            return "회원가입 성공";
        }else{
           return "회원가입 실패";
        }


    }

    public String updateUser(UserVO user){

        int result = userMapper.updateUser(user);

        if(result ==1){
            return "회원정보수정 완료";
        }else {
            return "회원정보수정 실패";
        }

       
    }

    public String deleteUser(int id){

        int result = userMapper.deleteUser(id);

        if(result ==1){
            return "회원삭제 완료";
        }else{
            return "회원삭제 실패";
        }

    }






    
}
