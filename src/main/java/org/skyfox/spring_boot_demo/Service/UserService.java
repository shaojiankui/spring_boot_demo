package org.skyfox.spring_boot_demo.Service;


import javax.annotation.Resource;

import org.skyfox.spring_boot_demo.entity.User;
import org.skyfox.spring_boot_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
 	@Autowired
    private UserMapper userMapper;


    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public boolean addUser(User record){
        boolean result = false;
        try {
        	userMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}