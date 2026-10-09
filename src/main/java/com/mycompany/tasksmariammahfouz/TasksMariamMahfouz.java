
package com.mycompany.tasksmariammahfouz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TasksMariamMahfouz {

    public static void main(String[] args) {

        // 1. Create objects using constructors
        HourlyEmployee e1 = new HourlyEmployee(
                1, "Ahmed", Gender.MALE,
                LocalDate.of(2023, 5, 10),
                100, 160, 50
        );

        MonthlyEmployee e2 = new MonthlyEmployee(
                12000, 21, 10, true,
                2, "Mariam", Gender.FEMALE,
                LocalDate.of(2022, 3, 15)
        );

        CommissionEmployee e3 = new CommissionEmployee(
                5000, 0.10, 20000,
                3, "Omar", Gender.MALE,
                LocalDate.of(2024, 1, 20)
        );

        // 2. Use setters
        e1.setHourlyRate(120);
        e2.setVacationDays(25);
        e3.setSalesAmount(30000);

        // 3. Use getters
        System.out.println("Employee name: " + e1.getName());
        System.out.println("Hourly rate: " + e1.getHourlyRate());
        System.out.println("Vacation days: " + e2.getVacationDays());
        System.out.println("Commission sales: " + e3.getSalesAmount());

        // 4. Create a list of employees (polymorphism)
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        // 5. Create a department
        Department department = new Department(
                101, "IT", e2, employees
        );

        // Assign the department to each employee
        for (Employee employee : employees) {
            employee.setDepartment(department);
        }

        // 6. Call methods from Department
        department.printAllEmployees();

        // 7. Search for an employee
        Employee found = department.findEmployee(2);

        if (found != null) {
            System.out.println("Found: " + found.getName());
        }

        // 8. Calculate salary using polymorphism
        for (Employee employee : employees) {
            System.out.println(
                    employee.getName() + " salary = "
                    + employee.calculateSalary()
            );
        }

        // 9. Calculate total payroll
        System.out.println(
                "Total payroll = " + department.totalPayroll()
        );

        // 10. Use toString()
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(department);

        // 11. Add another employee
        HourlyEmployee e4 = new HourlyEmployee(
                4, "Sara", Gender.FEMALE,
                LocalDate.of(2025, 6, 1),
                80, 150, 40
        );

        department.addEmployee(e4);
        e4.setDepartment(department);

        System.out.println(
                "Employees after adding Sara: "
                + department.getEmployees().size()
        );

        // 12. Remove an employee
        department.removeEmployee(e4);

        System.out.println(
                "Employees after removal: "
                + department.getEmployees().size()
        );

        // 13. Update department information
        department.setName("Software Development");
        System.out.println("Department: " + department.getName());

        // 14. Use enum values
        e1.setGender(Gender.FEMALE);
        System.out.println("Updated gender: " + e1.isGender());

        // 15. Check the manager
        System.out.println(
                "Manager: " + department.getManager().getName()
        );
    }
}