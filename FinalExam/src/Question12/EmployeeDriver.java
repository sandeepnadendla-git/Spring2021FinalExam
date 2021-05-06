/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sandeep Nadendla
 */
public class EmployeeDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Question 12 Answer:Sandeep Nadendla");
        ArrayList<Employee> employeelist = new ArrayList<>();

        employeelist.add(new Employee(1, "Sandeep", 9000));
        employeelist.add(new Employee(2, "Akhil", 6250));
        employeelist.add(new Employee(3, "Sandhya", 11000));
        employeelist.add(new Employee(4, "Sujith", 8000));
        employeelist.add(new Employee(5, "Vivek", 6000));

        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Collections.sort(employeelist);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Comparator<Employee> compareBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                }
                if (e1.getEmpSalary() < e2.getEmpSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(employeelist, compareBySalary);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Comparator<Employee> compareByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        };
        Collections.sort(employeelist, compareByName);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }
    }
}

