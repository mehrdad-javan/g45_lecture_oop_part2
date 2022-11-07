package se.lexicon;

import java.util.Arrays;

public class Student extends Person {
  // fields
  private int studentId;
  private String[] courses; // null

  // constructors
  public Student(int studentId, String firstName, String lastName, int age, Gender gender) {
    super(firstName, lastName, age, gender);
    this.studentId = studentId;
  }

  // methods
  public void registerCourse(String course) {
    if (courses == null) courses = new String[0];

    String[] newArray = Arrays.copyOf(courses, courses.length + 1);
    newArray[ newArray.length - 1] = course;
    courses = newArray;

  }

  public String courseInformation(){
    if (courses == null || courses.length == 0){
      return "-";
    }

    StringBuilder stringBuilder = new StringBuilder();

    for (String course : courses){
      stringBuilder.append(course).append("-");
    }

    return stringBuilder.toString();

  }

  // setters & getters

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String[] getCourses() {
    return courses;
  }

  public void setCourses(String[] courses) {
    this.courses = courses;
  }
}