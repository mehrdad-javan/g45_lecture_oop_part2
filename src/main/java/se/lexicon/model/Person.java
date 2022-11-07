package se.lexicon.model;

public abstract class Person {
  private String firstName;
  private String lastName;
  private int age;

  // Enum
  private Gender gender;

  // constructors
  public Person(String firstName, String lastName, int age, Gender gender){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
  }

  // methods
  public String getFullName(){
    return firstName + "," + lastName;
  }

  public abstract String getInformation();


  // getters & setters

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
}
