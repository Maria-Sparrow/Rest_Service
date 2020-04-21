package ua.lviv.iot.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.StudentRepository;
import ua.lviv.iot.spring.first.project.rest.model.Student;

@Service
public class StudentService {
  @Autowired
  private StudentRepository studentRepository;

  public Student createStudent(Student student) {
    return studentRepository.save(student);
  }

  public Student getStudent(Integer studentId) {
    return studentRepository.findById(studentId).get();
  }

    public List<Student> getAllStudents() {
      return studentRepository.findAll();
    }

  public List<Student> getAllByFirstName(String firstName) {
    return studentRepository.findAllByFirstName(firstName);
  }
}
