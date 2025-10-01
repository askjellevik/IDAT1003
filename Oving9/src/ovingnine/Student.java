package ovingnine;

public class Student {

  private String name;
  private int taskAmount;


  public Student(String name, int taskAmount) {
    this.name = name;
    this.taskAmount = taskAmount;
  }

  public String getName() {
    return name;
  }

  public int getTaskAmount() {
    return taskAmount;
  }

  public void increaseTaskAmount(int amount) {
    this.taskAmount += amount;
  }

  @Override
  public String toString() {
    return "Students name: " + name + ", amount of tasks approved: " + taskAmount;
  }


  public static void main(String[] args) {

    Student student = new Student("Geir Korsbø", 5);

    System.out.println("The name of the student is " + student.getName());
    System.out.println("The student has completed " + student.getTaskAmount() + " tasks");

    System.out.println(student);

    student.increaseTaskAmount(3);
    System.out.println("(Increased task amount by 3)");

    System.out.println(student);
    System.out.println("The student has now completed " + student.getTaskAmount() + " tasks");


  }


}
