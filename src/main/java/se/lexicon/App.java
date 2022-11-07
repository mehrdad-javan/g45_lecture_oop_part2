package se.lexicon;

import se.lexicon.model.Gender;
import se.lexicon.model.Student;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {

    Student student = new Student(1, "Test", "Test", 22, Gender.FEMALE);
    System.out.println(student);
  }


}
