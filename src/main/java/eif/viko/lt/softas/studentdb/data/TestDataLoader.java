package eif.viko.lt.softas.studentdb.data;

import eif.viko.lt.softas.studentdb.domain.Student;
import eif.viko.lt.softas.studentdb.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Random;

@RequiredArgsConstructor
@Component
public class TestDataLoader implements ApplicationListener<ContextRefreshedEvent> {

  private final StudentRepository studentRepository;

  @Override
  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

    String [] names = {"Tom", "Paul", "John", "Catherine", "Elizabeth", "Bill"};

    for(String name: names) {
      Student student = Student.builder().
          name(name).
          age(new Random().nextInt(10)+30).
          build();
      studentRepository.save(student);
    }
  }
}
