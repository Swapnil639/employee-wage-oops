package com.bridgelabz.oops;

public class EmployeeWage {
    static final int IS_FULL_TIME = 1;
    static final int Is_PART_TIME = 2;
    static final int EMP_WAGE_PER_HOUR = 20;

    static void switchCaseStatement() {
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

        if (empCheck == 1)
            System.out.println("Full Time");
        else if (empCheck == 2)
            System.out.println("Part Time");
        else
            System.out.println("Employee Absent");

        switch (empCheck)
        {
            case IS_FULL_TIME :
                empHrs=8;
                break;
            case Is_PART_TIME :
                empHrs=4;
                break;
            default:
                empHrs=0;
        }

        empWage = empHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Employee Hours :" + empHrs);
        System.out.println("Employee Wage :" + empWage);

    }

    public static void main(String[] args)
    {
        switchCaseStatement();
    }

}





