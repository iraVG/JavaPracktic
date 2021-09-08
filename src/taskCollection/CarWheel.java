package taskCollection;

import java.util.Objects;

public class CarWheel {
    private String manufacturer;
    private double diametr;
    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }



    public CarWheel(String manufacturer, double diametr) {
        this.manufacturer = manufacturer;
        this.diametr = diametr;
    }

    public CarWheel() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarWheel carWheel = (CarWheel) o;
        return Double.compare(carWheel.diametr, diametr) == 0 &&
                manufacturer.equals(carWheel.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, diametr);
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "manufacturer='" + manufacturer + '\'' +
                ", diametr=" + diametr +
                '}';
    }
}
