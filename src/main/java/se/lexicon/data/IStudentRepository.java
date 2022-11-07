package se.lexicon.data;

import se.lexicon.model.Student;

import java.util.Arrays;

public interface IStudentRepository extends IBaseRepository {

  int MAX_STUDENTS = 9999;

  Student[] findAll();
  
  Student findByStudentId(int studentId);
  
  boolean add(Student student);

  static void printStudent(Student[] students){
    for (Student student: students){
      System.out.println(student.getInformation());
    }
  }

  default Student[] addToArray(Student[] source, Student newElement){
    Student[] newArray = Arrays.copyOf(source, source.length + 1);
    newArray[newArray.length - 1] = newElement;
    return newArray;
  }


}
