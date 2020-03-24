package eif.viko.lt.softas.studentdb.repository;

import eif.viko.lt.softas.studentdb.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> { }
