package com.itgaoshu.springboot.Controller;

import com.itgaoshu.springboot.Service.StudentService;
import com.itgaoshu.springboot.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/StudentController")
public class StudentController {

    @Autowired
    private StudentService studentService;
        @RequestMapping("/seletcAllStudent.do")
        public String seletcAllStudent(Model model){
            List<Student> students=studentService.selectAllStudent();
            model.addAttribute("students",students);
            return "list";
    }
}
