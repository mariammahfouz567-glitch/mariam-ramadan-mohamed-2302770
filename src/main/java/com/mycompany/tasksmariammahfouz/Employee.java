
package com.mycompany.tasksmariammahfouz;
import java.time.LocalDate;
public abstract class Employee {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate hirDate;
    private Department department;
    public Employee(int id, String name, Gender gender,LocalDate hirDate){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hirDate = hirDate;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHirDate(LocalDate hirDate) {
        this.hirDate = hirDate;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender isGender() {
        return gender;
    }

    public LocalDate getHirDate() {
        return hirDate;
    }

    public Department getDepartment() {
        return department;
    }

    
     abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", hirDate=" + hirDate + ", department=" + department + '}';
    }
     
}

