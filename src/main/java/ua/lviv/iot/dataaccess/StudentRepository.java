package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.spring.first.project.rest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
