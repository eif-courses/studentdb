package eif.viko.lt.softas.studentdb.controller;

import eif.viko.lt.softas.studentdb.domain.Student;
import eif.viko.lt.softas.studentdb.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @RequestMapping("/")
  public String index(Model model){
    model.addAttribute("students", studentService.studentList());
    return "index";
  }
  @RequestMapping("about")
  public String about(){
    return "about";
  }
  @RequestMapping("details/{id}")
  public String details(Model model, @PathVariable(name = "id") Long id){
    Optional<Student> student = studentService.findStudentById(id);
    String s = student.orElseGet(()->new Student(55L, 555, "Unknow")).getName();
    model.addAttribute("student", s);
    return "details";
  }


}
