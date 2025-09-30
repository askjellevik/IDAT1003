package ovingeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Task1 {

  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    Person person1 = new Person("Ola", "Nordmann", 2000);
    Person person2 = new Person("Kari", "Marihøne", 2005);

    Employee employee1 = new Employee(person1, 1, 2020, 40000, 20);
    Employee employee2 = new Employee(person2, 2, 2021, 35000, 20);

    employeeList.add(employee1);
    employeeList.add(employee2);

    try {
      boolean runCode;
      runCode = true;

      //Print out employees on startup
      System.out.println("-------------");
      System.out.println("These are the registered employees in this program:");
      showEmployees(employeeList);
      System.out.println("-------------");
      System.out.println("Enter the employee number to the employee you want to continue with: ");

      int inpChoice;

      Employee chosenEmployee;
      chosenEmployee = chooseEmployee(scanner, employeeList);

      int menuDisplayVariable = 0;

      // display the menu
      while (runCode) {
        if (menuDisplayVariable == 0) {
          showMainMenu();
          inpChoice = readInt(scanner);
          menuDisplayVariable = inpChoice;
        } else if (menuDisplayVariable == 1) {
          showDisplayOptions();
          inpChoice = readInt(scanner);
          if (inpChoice == 1) {
            System.out.println(chosenEmployee.getTaxPerMonth());
          } else if (inpChoice == 2) {
            System.out.println(chosenEmployee.getGrossSalary());
          } else if (inpChoice == 3) {
            System.out.println(chosenEmployee.getTaxDeduction());
          } else if (inpChoice == 4) {
            System.out.println(chosenEmployee.getName());
          } else if (inpChoice == 5) {
            System.out.println(chosenEmployee.getAge());
          } else if (inpChoice == 6) {
            System.out.println(chosenEmployee.getYearsHired());
          } else if (inpChoice == 7) {
            System.out.println("Enter a year to check with: ");
            int yearToCheck = readInt(scanner);
            if (chosenEmployee.workedLongerThan(yearToCheck)) {
              System.out.println("Yes, the employee has worked that long");
            } else {
              System.out.println("No, the employee has not worked for that long");
            }
          } else if (inpChoice == 8) {
            menuDisplayVariable = 0;
          }
        } else if (menuDisplayVariable == 2) {
          showChangingOptions();
          inpChoice = readInt(scanner);
          if (inpChoice == 1) {
            System.out.println("Enter the new monthly percentage: ");
            int newMonthlySalary = readInt(scanner);
            chosenEmployee.setMonthlySalary(newMonthlySalary);
          } else if (inpChoice == 2) {
            System.out.println("Enter the new tax percentage: ");
            int newTaxPercentage = readInt(scanner);
            chosenEmployee.setTaxPercentage(newTaxPercentage);
          } else if (inpChoice == 3) {
            menuDisplayVariable = 0;
          }
        } else if (menuDisplayVariable == 3) {
          showEmployees(employeeList);
          System.out.println("Enter the employee's employee number");
          chosenEmployee = chooseEmployee(scanner, employeeList);
          menuDisplayVariable = 0;
        } else if (menuDisplayVariable == 4) {
          runCode = false;
        }
      }

    } finally {
      scanner.close();
    }


  }


  public static void showEmployees(List<Employee> employeeList) {
    for (Employee employee : employeeList) {
      System.out.println(employee.getName() + ". Employee number: " + employee.getEmployeeNr());
    }
  }


  public static void showMainMenu() {
    System.out.println(
        "Welcome to the Employee program. Enter the number corresponding to your choice: ");
    System.out.println("1: Show options to display the data of the employee");
    System.out.println("2: Show options to change the data of the employee");
    System.out.println("3: Change the chosen employee");
    System.out.println("4: End program");
  }


  public static void showDisplayOptions() {
    System.out.println("----------------");
    System.out.println("Enter the number corresponding to your choice: ");
    System.out.println("1: Display the employee's tax deduction per month");
    System.out.println("2: Display the employee's gross income");
    System.out.println("3: Display the employee's tax deduction");
    System.out.println("4: Display the employee's name");
    System.out.println("5: Display the employee's age");
    System.out.println("6: Display the employee's amount of working years");
    System.out.println(
        "7: Check if the employee has worked for more than a giving amount of years");
    System.out.println("8: Go back");
  }


  public static void showChangingOptions() {
    System.out.println("----------------");
    System.out.println("Enter the number corresponding to your choice: ");
    System.out.println("1: Change the employees monthly income");
    System.out.println("2: Change the employees tax percentage");
    System.out.println("3: Go back");
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

  public static Employee chooseEmployee(Scanner scanner, List<Employee> employeeList) {
    while (true) {
      int inpChoice = readInt(scanner);
      for (Employee employee : employeeList) {
        if (inpChoice == employee.getEmployeeNr()) {
          return employee;
        }
      }
      System.out.println("No employee found with the given employee number. Please try again:");
    }
  }


}
