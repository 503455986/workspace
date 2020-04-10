package com.itgaoshu.springboot.Service.ServiceImpl;

import com.itgaoshu.springboot.Service.StudentService;
import com.itgaoshu.springboot.bean.Student;
import com.itgaoshu.springboot.mapper.StudentMapper;
import com.itgaoshu.springboot.mapper.StudentMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl  implements StudentService {

    @Autowired
    StudentMapper2 studentMapper2;
    @Override
    @Cacheable("selectAllStudent")
    public List<Student> selectAllStudent() {
        System.out.println("123123");
        return studentMapper2.selectAll();
    }
}
