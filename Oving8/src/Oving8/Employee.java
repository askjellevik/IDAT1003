package Oving8;


import java.util.Calendar;

public class Employee {
    private Person personalia;
    private int employeeNr, employmentYear;
    private double monthlySalary, taxPercentage;
    private java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();


    //Constructor
    public Employee(Person personalia, int employeeNr, int employmentYear, double monthlySalary, double taxPercentage) {
        this.personalia = personalia;
        this.employeeNr = employeeNr;
        this.employmentYear = employmentYear;
        this.monthlySalary = monthlySalary;
        this.taxPercentage = taxPercentage;
    }


    //Getters
    public Person getPersonalia() {
        return personalia;
    }
    public int getEmployeeNr(){
        return employeeNr;
    }
    public int getEmploymentYear(){
        return employmentYear;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public double getTaxPercentage() {
        return taxPercentage;
    }



    //Setters
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }


    //Methods
    public double taxPerMonth(){
        return monthlySalary*taxPercentage/100;
    }
    public double grossSalary(){
        return 12*monthlySalary - 10.5*monthlySalary*taxPercentage/100;
    }
    public String getName() {
        return personalia.getLastName() + ", " + personalia.getFirstName();
    }
    public int getAge() {
        int thisYear = calendar.get(Calendar.YEAR);
        return thisYear - personalia.getBirthdate();
    }
    public int getYearsHired() {
        int thisYear = calendar.get(Calendar.YEAR);
        return thisYear - employmentYear;
    }
    public boolean workedLongerThan(int amountOfYears) {
        return getYearsHired() > amountOfYears;
    }


}
