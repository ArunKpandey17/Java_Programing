package Logical_programming;
import java.util.Scanner;

class office {
  private String firstName;
  private String lastName;
  private int employeeId;
  private double salary;
  private int noOfProject;

  public office(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.employeeId = employeeId;
    this.salary = salary;
    this.noOfProject = noOfProject;
  }

  public void calculateSalary() {
    if (noOfProject < 0) {
      System.out.println("Number of projects cannot be negative");
      System.out.println("Salary remains: " + salary);
    } else if (noOfProject >= 0 && noOfProject < 5) {
      System.out.println("No Bounu");
      System.out.println("Salary remains: " + salary);
    } else if (noOfProject >= 5 && noOfProject <= 10) {
      salary += 5000;
      System.out.println(" the updated salary: " + salary);
    } else if (noOfProject > 10 && noOfProject <= 20) {
      salary += 10000;
      System.out.println(" the updated salary: " + salary);
    } else {
      salary += 15000;
      System.out.println(" the updated salary: " + salary);
    }

  }

}

public class Employee {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your First Name: ");
    String firstname = sc.nextLine();
    System.out.print("Enter your Last Name: ");
    String lastname = sc.nextLine();
    System.out.print("Enter a EmployyeId: ");
    int employeeId = sc.nextInt();
    System.out.print("Enter a salary: ");
    int salary = sc.nextInt();
    System.out.print("Enter a noOfproject: ");
    int noOfProject = sc.nextInt();

    office f1 = new office(firstname, lastname, employeeId, salary, noOfProject);
    f1.calculateSalary();
    
    
  }
}