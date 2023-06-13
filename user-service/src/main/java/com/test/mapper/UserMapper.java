package com.test.mapper;

import com.test.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zzq
 * @date 2023年06月09日 9:29
 */
@Mapper
public interface UserMapper {
    @Select("select * from db_user where uid= #{uid}")
    User getUserByIdAPI(int uid);
}
