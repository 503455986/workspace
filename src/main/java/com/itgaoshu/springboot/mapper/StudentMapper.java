package com.itgaoshu.springboot.mapper;

import com.itgaoshu.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from Student")
    public List<Student> selectAllStuden();

}
