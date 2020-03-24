package eif.viko.lt.softas.studentdb.service;

import eif.viko.lt.softas.studentdb.domain.Student;
import eif.viko.lt.softas.studentdb.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

  private final StudentRepository studentRepository;

  @Override
  public Iterable<Student> studentList() {
    return studentRepository.findAll();
  }

  @Override
  public Optional<Student> findStudentById(Long id) {
    return studentRepository.findById(id);
  }


}
