
package com.mycompany.tasksmariammahfouz;

import java.time.LocalDate;

/**
 *
 * @author Mariam Mahfouz
 */
public class MonthlyEmployee extends Employee{
    private double monthlySalary;
    private int vacationDays;
    private double bonousPercentage;
    private boolean hasHealthInsurance;

    public MonthlyEmployee(double monthlySalary, int vacationDays, double bonousPercentage, boolean hasHealthInsurance, int id, String name, Gender gender, LocalDate hirDate) {
        super(id, name, gender, hirDate);
        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonousPercentage = bonousPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public void setBonousPercentage(double bonousPercentage) {
        this.bonousPercentage = bonousPercentage;
    }

    public void setHasHealthInsurance(boolean hasHealthInsurance) {
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public double getBonousPercentage() {
        return bonousPercentage;
    }

    public boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }
    @Override
    public double calculateSalary(){
        return this.monthlySalary + (this.bonousPercentage/100.0* this.monthlySalary);
    }
    public int calculateAdditionalVacation(){
        if(this.getHirDate() == null)
            return 0;
        // we suppose that for each year, there is one day off 
        
        int yearsOfWork = java.time.Period.between(this.getHirDate(), LocalDate.now()).getYears();
        int daysOfVacation = yearsOfWork;
        return daysOfVacation;
    }

    @Override
    public String toString() {
        return "MonthlyEmployee{" + "monthlySalary=" + monthlySalary + ", vacationDays=" + vacationDays + ", bonousPercentage=" + bonousPercentage + ", hasHealthInsurance=" + hasHealthInsurance + '}';
    }
    
}
