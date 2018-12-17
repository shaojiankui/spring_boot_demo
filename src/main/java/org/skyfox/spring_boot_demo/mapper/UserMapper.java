package org.skyfox.spring_boot_demo.mapper;

import org.skyfox.spring_boot_demo.entity.User;

public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
