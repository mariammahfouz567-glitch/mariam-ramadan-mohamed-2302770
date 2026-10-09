
package com.mycompany.tasksmariammahfouz;

import java.time.LocalDate;

/**
 *
 * @author MariamMahfouz
 */
public class CommissionEmployee extends Employee{
    private double baseSalary;
    private double commissionRAte;
    private double salesAmount;

    public CommissionEmployee(double baseSalary, double commissionRAte, double salesAmount, int id, String name, Gender gender, LocalDate hirDate) {
        super(id, name, gender, hirDate);
        this.baseSalary = baseSalary;
        this.commissionRAte = commissionRAte;
        this.salesAmount = salesAmount;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setCommissionRAte(double commissionRAte) {
        this.commissionRAte = commissionRAte;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommissionRAte() {
        return commissionRAte;
    }

    public double getSalesAmount() {
        return salesAmount;
    }
    private double calculateCommission(){
        return this.baseSalary * this.commissionRAte;
    }
    @Override
    public double calculateSalary(){
        return this.calculateCommission() + this.salesAmount;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "baseSalary=" + baseSalary + ", commissionRAte=" + commissionRAte + ", salesAmount=" + salesAmount + '}';
    }
    
}
