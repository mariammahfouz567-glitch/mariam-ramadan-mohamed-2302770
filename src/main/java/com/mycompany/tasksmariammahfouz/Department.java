
package com.mycompany.tasksmariammahfouz;

import java.util.List;

public class Department {
    private int id;
    private String name; 
    private Employee manager;
    private List<Employee> employees;

    public Department(int id, String name, Employee manager, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        if(employees.contains(employee) == false){
            return;
        }
    }
    public Employee findEmployee(int employeeId){
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).getId() == employeeId){
                return employees.get(i);
            }
        }
        System.out.println("Employee is not found");
        return null;
    }
    public double totalPayroll(){
        double total = 0.0f;
        for (int i = 0; i < employees.size(); i++) {
            total += employees.get(i).calculateSalary();
        }
        return total;
    }
    public void printAllEmployees(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("-------------------------------------------------");
            System.out.println("Employee ID : " + employees.get(i).getId());
            System.out.println("Employee Name : " + employees.get(i).getName());
            System.out.println("Employee Gender : " + employees.get(i).isGender());
            System.out.println("Employee HirDate: " + employees.get(i).getHirDate());
            System.out.println("Employee Department : " + employees.get(i).getDepartment());
            System.out.println("-------------------------------------------------");
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + ", manager=" + manager + ", employees=" + employees + '}';
    }
    
}
