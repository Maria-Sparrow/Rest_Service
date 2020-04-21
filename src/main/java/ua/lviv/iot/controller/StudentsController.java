package ua.lviv.iot.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.business.StudentService;
import ua.lviv.iot.spring.first.project.rest.model.Student;

@RequestMapping("/students")
@RestController
public class StudentsController {
  private Map<Integer, Student> students = new HashMap<>();
  @Autowired
  private StudentService studentService;
  @GetMapping()
  public List<Student> getStudents(final @RequestParam(value = "firstName", required = false) String firstName) {
    if (firstName == null) {
      return studentService.getAllStudents();
    }
    return studentService.getAllByFirstName(firstName);
  }

  @GetMapping(path = "/{id}")
  public Student getStudent(final @PathVariable("id") Integer studentId) {
    return studentService.getStudent(studentId);
  }
  @PostMapping
  public Student createStudent(final @RequestBody Student student) {
    return studentService.createStudent(student);
  }
  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Student> deleteStudent(@PathVariable("id") Integer studentId) {
    HttpStatus status = students.remove(studentId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
    return ResponseEntity.status(status).build();
  }
  @PutMapping(path = "/{id}")
  public ResponseEntity<Student> updateStudent(final @PathVariable("id") Integer studentId,
                                               final @RequestBody Student student) {
    student.setId(studentId);
    ResponseEntity<Student> response = students.replace(studentId, student) == null
            ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
            : new ResponseEntity<>(student, HttpStatus.OK);
    return response;
  }
}

