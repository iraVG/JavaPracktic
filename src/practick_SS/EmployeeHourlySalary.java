package practick_SS;

import java.util.Objects;

public class EmployeeHourlySalary extends Employee {
    double hourlyWage;

    public EmployeeHourlySalary(int id, String name, double hourlyWage) {
        super(id, name);
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double averageMonthlySalary() {
        return hourlyWage*20.8*8;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmployeeHourlySalary that = (EmployeeHourlySalary) o;
        return Double.compare(that.averageMonthlySalary(), averageMonthlySalary()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlyWage);
    }
}
