package se.lexicon.model;

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

  @Override
  public String getInformation() {
    return "Teacher Information is : " + getFullName() + " id: " + teacherId;
  }


}
