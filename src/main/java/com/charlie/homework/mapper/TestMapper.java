package com.charlie.homework.mapper;

import com.charlie.homework.entity.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Insert("insert into students(name) values(#{name})")
    int insert(Test test);

    @Select("select * from students where name= #{name}")
    Test select(@Param("name") String name );

}
