package eif.viko.lt.softas.studentdb.service;

import eif.viko.lt.softas.studentdb.domain.Student;

import java.util.Optional;

public interface StudentService {
  Iterable<Student> studentList();
  Optional<Student> findStudentById(Long id);
}
