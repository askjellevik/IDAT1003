package ovingeight;

import java.util.Calendar;

/**
 * Employee class.
 */
public class Employee {

  private final Person personalia;
  private final int employeeNr;
  private final int employmentYear;
  private double monthlySalary;
  private double taxPercentage;
  private final java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();

  // Constructor

  /**
   * Employee constructor.
   */
  public Employee(Person personalia, int employeeNr, int employmentYear, double monthlySalary,
      double taxPercentage) {
    this.personalia = personalia;
    this.employeeNr = employeeNr;
    this.employmentYear = employmentYear;
    this.monthlySalary = monthlySalary;
    this.taxPercentage = taxPercentage;
  }


  // Getters
  public Person getPersonalia() {
    return personalia;
  }

  public int getEmployeeNr() {
    return employeeNr;
  }

  public int getEmploymentYear() {
    return employmentYear;
  }

  public double getMonthlySalary() {
    return monthlySalary;
  }

  public double getTaxPercentage() {
    return taxPercentage;
  }


  // Setters
  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  public void setTaxPercentage(double taxPercentage) {
    this.taxPercentage = taxPercentage;
  }


  // Methods
  public double getTaxPerMonth() {
    return monthlySalary * taxPercentage / 100;
  }

  public double getGrossSalary() {
    return 12 * monthlySalary - 10.5 * monthlySalary * taxPercentage / 100;
  }

  public double getTaxDeduction() {
    return 10.5 * monthlySalary * taxPercentage / 100;
  }

  public String getName() {
    return personalia.getLastName() + ", " + personalia.getFirstName();
  }


  public int getAge() {
    return calendar.get(Calendar.YEAR) - personalia.getBirthdate();
  }

  public int getYearsHired() {
    return calendar.get(Calendar.YEAR) - employmentYear;
  }

  /**
   *Method to check years worked.
   */
  public boolean workedLongerThan(int amountOfYears) {
    return getYearsHired() > amountOfYears;
  }


}
