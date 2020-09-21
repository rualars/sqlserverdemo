package com.example.sqlserverdemo.dao;

import com.example.sqlserverdemo.entity.Access;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AccessDao {

    @Results(id = "accessMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "license", column = "license"),
            @Result(property = "accessType", column = "access_type"),
            @Result(property = "time", column = "time"),
            @Result(property = "isE", column = "is_e")
    })
    @Select("select * from t_car_access where id = #{id}")
    Access getById(Integer id);

    @Insert("insert into t_car_access (id, license, access_type, time, is_e) values (#{id}, #{license}, #{accessType}, #{time}, #{isE})")
    void save(Access access);

    @Update("update t_car_access set id = #{id}, license = #{license}, accessType = #{accessType}, time = #{time}, isE = #{isE}")
    void update(Access access);

    @Delete("delete from t_car_access where id = #{id}")
    void delete(Integer id);
}