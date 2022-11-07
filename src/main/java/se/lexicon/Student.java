package se.lexicon;

import java.util.Arrays;

public class Student extends Person {

  public static final int MAX_COURSES = 5;

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
    if (courses.length > MAX_COURSES){
      throw new IllegalArgumentException("number of registered course should not be grater than " + MAX_COURSES);
    }

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


  public String getInformation(){
    return "studentId: " + studentId + " Name: " + getFullName();
  }

  @Override
  public String getFullName(){
    return "FullName: " + getFirstName() + " " + getLastName() + " ";
  }

  @Override
  public String toString() {
    return "Student{" +
            "studentId=" + studentId +
            ", courses=" + Arrays.toString(courses) +
            '}';
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
