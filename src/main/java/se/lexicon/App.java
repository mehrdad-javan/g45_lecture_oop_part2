package se.lexicon;

import se.lexicon.data.IStudentRepository;
import se.lexicon.data.StudentRepository;
import se.lexicon.model.Gender;
import se.lexicon.model.Student;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {

    Student student1 = new Student(1, "Test", "Test", 22, Gender.FEMALE);
    Student student2 = new Student(3, "Test3", "Test3", 22, Gender.MALE);

    StudentRepository studentRepository = new StudentRepository();

    studentRepository.add(student1);
    System.out.println(studentRepository.getSize());
    studentRepository.add(student2);
    System.out.println(studentRepository.getSize());



  }


}
