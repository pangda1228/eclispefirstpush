package demo.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.ssm.entity.Student;
import demo.ssm.service.StudentService;
import sun.misc.Contended;

@Controller
@RequestMapping("controller")
public class StudentController {
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping("queryStudentById/{id}")
	public String queryStudentById(@PathVariable("id") Integer id,Map<String,Object> map) {
		Student student = studentService.queryStudentById(id);
		map.put("student", student);
		return "result";
	}

}
