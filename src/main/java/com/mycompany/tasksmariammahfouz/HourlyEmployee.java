
package com.mycompany.tasksmariammahfouz;
import java.time.LocalDate;
public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private double overTimeRate;

    public HourlyEmployee(int id, String name, Gender gender, LocalDate hireDate, double hourlyRate, double hoursWorked, double overTimeRate){
        super(id, name, gender, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overTimeRate = overTimeRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    
    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }
    @Override
    public double calculateSalary(){
        return (this.hoursWorked + this.overTimeRate) * this.hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + ", overTimeRate=" + overTimeRate + '}';
    }
    
    
}
