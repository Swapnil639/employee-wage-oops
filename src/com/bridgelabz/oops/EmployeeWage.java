package com.bridgelabz.oops;

import java.util.ArrayList;

class EmpWage implements IEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    static ArrayList<CompanyEmpWage>companyEmpWageArray = new ArrayList<CompanyEmpWage>();

    public static void main(String[] args) {
        EmpWage empWage = new EmpWage();
        System.out.println("Welcome to EmployeeWage");
        empWage.addCompanyEmpWage("Wipro", 20, 20, 100);
        empWage.addCompanyEmpWage("HCL", 20, 15, 100);
        empWage.addCompanyEmpWage("Infosys", 25, 20,80);
        empWage.computeEmpWage();
    }


    public void addCompanyEmpWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage  = new CompanyEmpWage(companyName, empRatePerHr, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageArray.add(companyEmpWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageArray.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageArray.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays <= companyEmpWage.getNumOfWorkingDays() && totalEmpHrs < companyEmpWage.getMaxHoursPerMonth()) {
            totalWorkingDays++;
            double empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            int empWage = empHrs * companyEmpWage.getEmpRatePerHr();
            totalEmpHrs += empHrs;
            totalEmpWage += empWage;
        }
        return totalEmpWage;
    }


}