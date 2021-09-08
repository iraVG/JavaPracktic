package practick_SS;

import java.util.Objects;

public class EmployeeFixedSalary extends Employee {
    double fixedPayment;
    @Override
    public double averageMonthlySalary() {

        return fixedPayment;
    }

    public EmployeeFixedSalary(int id, String name, double fixedPayment) {
        super(id, name);
        this.fixedPayment = fixedPayment;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmployeeFixedSalary that = (EmployeeFixedSalary) o;
        return Double.compare(that.fixedPayment, fixedPayment) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fixedPayment);
    }


}
