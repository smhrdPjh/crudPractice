package com.example.demo.controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserVO;
import com.example.demo.service.UserService;

 
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
 
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    
  @GetMapping
  public List<UserVO> userList(){

   
    return userMapper.userList();
  }
    
    @PostMapping
    String insertUser(@RequestBody UserVO user) {

       return userService.insertUser(user);
        
    }
    
    @GetMapping("/{id}")
    public UserVO fetchUserByID(@PathVariable int id) {
        System.out.println(userMapper.fetchUserByID(id));
        UserVO fetchUser = userMapper.fetchUserByID(id);
        return fetchUser;

    }   
        
    @PostMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody UserVO user){

       
       return userService.updateUser(user);
    }
 
    
    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {

        return userService.deleteUser(id);
        
        
    }
    
}

