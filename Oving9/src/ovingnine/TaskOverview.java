package ovingnine;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOverview {

  private ArrayList<Student> students;
  private int amountOfStudents;

  public TaskOverview(ArrayList<Student> students) {
    this.students = students;
    this.amountOfStudents = students.size();
  }

  public int getAmountOfStudents() {
    return amountOfStudents;
  }

  public int solvedTasksByStudent(Student student) {
    return student.getTaskAmount();
  }

  public void registerNewStudent(String name, int taskAmount) {
    Student newStudent = new Student(name, taskAmount);
    students.add(newStudent);
    amountOfStudents += 1;
  }

  public void increaseTaskForStudent(Student student, int amountToIncrease) {
    student.increaseTaskAmount(amountToIncrease);
  }


  public static void main(String[] args) {

    boolean runCode = true;
    int menuOutput = 0;
    Scanner scanner = new Scanner(System.in);

    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Geir Korsbø", 5));
    students.add(new Student("Tore Onsøien", 7));

    TaskOverview overview = new TaskOverview(students);

    while (runCode) {
      if (menuOutput == 0) {
        showMainMenu();
        System.out.println("--------");
        menuOutput = readInt(scanner);
      } else if (menuOutput == 1) {
        System.out.println(overview.getAmountOfStudents());
        menuOutput = 0;
      } else if (menuOutput == 2) {
        Student chosenStudent = chooseStudent(students, scanner);
        System.out.println(
            "This student has " + overview.solvedTasksByStudent(chosenStudent) + " tasks done");
        menuOutput = 0;
      } else if (menuOutput == 3) {
        Student chosenStudent = chooseStudent(students, scanner);
        System.out.println("What do you want to change? ");
        System.out.println("1: Increase the number of tasks done");
        int choiceOfChange = readInt(scanner);
        if (choiceOfChange == 1) {
          System.out.println("Enter the amount of tasks to increase");
          int increaseAmount = readInt(scanner);
          overview.increaseTaskForStudent(chosenStudent, increaseAmount);
          menuOutput = 0;
        } else {
          System.out.println("That was not a valid option. Choose the student again:");
        }
      } else if (menuOutput == 4) {
        System.out.println("Enter the name of the new student: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the amount of tasks done: ");
        int tasksDone = readInt(scanner);
        scanner.nextLine();
        overview.registerNewStudent(newName, tasksDone);
        menuOutput = 0;
      } else if (menuOutput == 5) {
        displayAllStudents(students);
        menuOutput = 0;
      } else if (menuOutput == 6) {
        int totalTaskAmount = 0;
        for (Student student : students) {
          totalTaskAmount += student.getTaskAmount();
        }
        System.out.println("The total amount of tasks done: " + totalTaskAmount + " tasks");
        menuOutput = 0;
      } else if (menuOutput == 7) {
        System.out.println("Ending program");
        runCode = false;
      } else {
        System.out.println("Enter a valid menu option");
      }


    }
  }

  public static void showMainMenu() {
    System.out.println("------");
    System.out.println("Enter the corresponding number to your choice: ");
    System.out.println("1: Show the amount of students registered");
    System.out.println("2: Display the data of a specific student");
    System.out.println("3: Change the data of a specific student");
    System.out.println("4: Register a new student");
    System.out.println("5: Display all students data");
    System.out.println("6: Count the total amount of tasks done by all students");
  }

  public static void displayAllStudents(ArrayList<Student> students) {
    System.out.println("------");
    int i = 1;
    for (Student student : students) {
      System.out.println(i + ": " + student);
      i++;
    }
  }

  public static Student chooseStudent(ArrayList<Student> students, Scanner scanner) {
    System.out.println("Enter the number corresponding to the student of your choice: ");
    displayAllStudents(students);
    while (true) {
      int inpChoice = readInt(scanner);
      if (inpChoice > 0 && inpChoice <= students.size()) {
        return students.get(inpChoice - 1);
      }
      System.out.println("Did not find the student you entered, try again");
    }
  }

  public static int readInt(Scanner scanner) {
    while (true) {
      if (scanner.hasNextInt()) {
        return scanner.nextInt();
      } else {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.next(); //
      }
    }
  }


}
