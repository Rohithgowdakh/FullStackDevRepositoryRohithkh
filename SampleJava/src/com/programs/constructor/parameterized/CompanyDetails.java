package com.programs.constructor.parameterized;

class Employee {
    String employeeName;
    int employeeId;
    String designation;
    double salary;

    Employee(String eName, int eId, String eDesignation, double eSalary) {
        employeeName = eName;
        employeeId = eId;
        designation = eDesignation;
        salary = eSalary;
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Department {
    String departmentName;
    int departmentId;
    String headOfDepartment;
    int numberOfEmployees;

    Department(String dName, int dId, String dHead, int dEmployees) {
        departmentName = dName;
        departmentId = dId;
        headOfDepartment = dHead;
        numberOfEmployees = dEmployees;
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department ID: " + departmentId);
        System.out.println("Head of Department: " + headOfDepartment);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println();
    }
}

class Insurance {
    String insuranceName;
    int policyNumber;
    double coverageAmount;
    String insuredPerson;

    Insurance(String iName, int iPolicy, double iCoverage, String iPerson) {
        insuranceName = iName;
        policyNumber = iPolicy;
        coverageAmount = iCoverage;
        insuredPerson = iPerson;
        System.out.println("Insurance Name: " + insuranceName);
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Coverage Amount: " + coverageAmount);
        System.out.println("Insured Person: " + insuredPerson);
        System.out.println();
    }
}

public class CompanyDetails {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Smith", 1001, "Software Engineer", 75000.00);
        Department department1 = new Department("IT", 501, "Jane Doe", 25);
        Insurance insurance1 = new Insurance("Health Insurance", 202345, 100000.00, "John Smith");
    }
}
