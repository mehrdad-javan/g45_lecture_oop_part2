package se.lexicon;

public class Teacher extends Person {

  private int teacherId;


  public Teacher(int teacherId, String firstName, String lastName, int age, Gender gender) {
    super(firstName, lastName, age, gender);
    this.teacherId = teacherId;
  }

  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }
}
