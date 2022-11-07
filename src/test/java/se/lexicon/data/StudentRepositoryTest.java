package se.lexicon.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.Gender;
import se.lexicon.model.Student;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRepositoryTest {


  private StudentRepository testObject;

  @BeforeEach
  public void setUp() {
    testObject = new StudentRepository();
    Student student = new Student(1, "Test", "Test", 22, Gender.FEMALE);
    testObject.add(student);
  }

  @Test
  public void getSize() {
    int expectedSize = 1;
    int actual = testObject.getSize();

    assertEquals(actual, expectedSize);
  }


  @Test
  public void clear() {
    int expectedSize = 0;
    testObject.clear();

    assertEquals(testObject.getSize(), expectedSize);
  }


  @Test
  public void findById() {
    Student expected = new Student(1, "Test", "Test",  22, Gender.FEMALE);

    Student actual = testObject.findByStudentId(1);

    assertEquals(expected.getStudentId(), actual.getStudentId());
  }

  @Test
  public void add() {
    Student newStudent = new Student(2, "Test2", "Test22", 20, Gender.MALE);
    assertTrue(testObject.add(newStudent));
    assertEquals(2, testObject.getSize());
  }

  @Test
  public void add_false(){
    Student newStudent = new Student(1, "Test2", "Test22", 20, Gender.MALE);
    assertFalse(testObject.add(newStudent));

  }

}
