package taskCollection;

import java.util.Objects;

public class Auto implements Comparable <Auto>{

    private String model;
    private int year;
    private String number;
    private String color;
    private Engine engine;
    private CarWheel carWheel;

    public Auto() {
    }


    public Auto(String model, int year, String number, String color, Engine engine, CarWheel carWheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.color = color;
        this.engine = engine;
        this.carWheel = carWheel;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarWheel getCarWheel() {
        return carWheel;
    }

    public void setCarWheel(CarWheel carWheel) {
        this.carWheel = carWheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return year == auto.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", carWheel=" + carWheel +
                '}';
    }

    @Override
    public int compareTo(Auto o) {

        return this.getYear()-o.getYear();
    }


}
//    є класс авто
//        поля
// - модель
//         - рік
//         - номер
//         - колір
//         - Двигун (к)
//         - модель
//         - об'єм
//         - кінські сили
//         - Колесо (к)
//         -виробник
//         -діаметр
//
//
//         Створити колекцію авто яка буде посортивана за роком випуску
//         Пройтись по коллекції, всі автівки які меньше 2000 року
//         змінити радіус колеса на одн меньше від поточного
//         всі автівки які старіше 2000 року пепефарбувати в зелений