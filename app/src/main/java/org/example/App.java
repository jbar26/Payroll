package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Payroll Calculator!");
    System.out.println();
    Scanner keys = new Scanner(System.in);
    PayrollCalc payrollCalc = new PayrollCalc();
    double hours;
    int dependents;
    double rate;
    boolean isUnionMember;
    double gross;
    double expenses;

    System.out.print("How many hours did you work this week?  ");
    hours = keys.nextDouble();
    System.out.print("What is your pay rate?  ");
    rate = keys.nextDouble();
    System.out.print("How many dependents do you have?  ");
    dependents = keys.nextInt();
    System.out.print("Are you a Union Member?  'Y/N'  ");
    String unionStatus = keys.next();
    if(unionStatus.substring(0, 1).toUpperCase().equals("Y"))
    {
        isUnionMember = true;
    }
    else
    {
        isUnionMember = false;
    }
    System.out.println();
    System.out.println("Payroll Stub:");
    System.out.println();

    System.out.println("Hours:\t" + hours);
    System.out.println("Rate:\t$ " + rate + " /hr");
    gross = payrollCalc.calcGrossPay(rate, hours);
    System.out.print("Gross:\t$ ");
    System.out.printf("%.2f", gross);
    System.out.println();
    System.out.printf("SocSec:\t$ %.2f", payrollCalc.calcSocSec(gross));
    System.out.printf("\nFedTax:\t$ %.2f", payrollCalc.calcFedTax(gross));
    System.out.printf("\nStTax:\t$ %.2f" , payrollCalc.calcStTax(gross));
    System.out.printf("\nUnion:\t$ %.2f", payrollCalc.calcUnionDues(isUnionMember));
    System.out.printf("\nIns:\t$ %.2f", payrollCalc.calcInsurance(dependents));

    System.out.println("\nThank you for using the Payroll Calculator!");


  }
}
