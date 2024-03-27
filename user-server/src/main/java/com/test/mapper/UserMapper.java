package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author: qxd
 * @date: 2024/2/19
 * @description:
 */

@Mapper
public interface UserMapper {
    @Select("select * from DB_USER where uid = #{uid}")
    User getUserById(int uid);

    @Select("select book_count from DB_USER where uid = #{uid}")
    int getUserBookCount(int uid);

    @Update("update DB_USER set book_count = #{count} where uid = #{uid}")
    int updateBookCount(int uid, int count);
}