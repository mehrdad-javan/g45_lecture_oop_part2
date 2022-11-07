package se.lexicon.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class StudentTest {

  Student testObject;

  @BeforeEach
  public void setup(){
    testObject = new Student(1, "Test", "Test", 22, Gender.FEMALE);
  }


  //@Order(1)
  @Test
  @DisplayName("test student object")
  public void testObject_successfully_instantiated(){
    assertEquals("Test", testObject.getFirstName());
    assertEquals("Test", testObject.getLastName());
    assertEquals(22, testObject.getAge());
  }

  //@Order(2)
  @Test
  public void test_setFirstName_successfully(){
    testObject.setFirstName("Mehrdad");
    assertEquals("Mehrdad", testObject.getFirstName());
  }

  @Test
  public void test_setFirstName_null_throw_exception(){
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        testObject.setFirstName(null);
      }
    });
  }


}
