package com.bridgelabz.oops;

public class EmployeeWage {

    static int IS_FULL_TIME = 1;

    static void employeeAttendance() {
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        System.out.println(empCheck);

        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }

    public static void main(String[] args) {

        employeeAttendance();
    }

}



