package org.example;

public class PayrollCalc {
    public double calcGrossPay(double rate, double hours)
    {
        double result = 0;
        if(hours <= 40)
        {
            result = rate * hours;
            return Math.round(result * 100)/100.0;
        }
        else {
            result = rate * 40;
            result += (rate * 1.5)*(hours - 40);
            return Math.round(result * 100)/100.0;
        }
    }
    public double calcSocSec(double gross)
    {
        return gross*.06;
    }
    public double calcFedTax(double gross)
    {
        return gross*.14;
    }
    public double calcStTax(double gross)
    {
        return gross*.05;
    }
    public double calcUnionDues(boolean isMember)
    {
        if(isMember)
        {
            return 10;
        }
        else
        {
            return 0;
        }
    }
    public double calcInsurance(int numDependents)
    {
        if(numDependents >= 3)
        {
            return 35;
        }
        else
        {
            return 15;
        }
    }

}
