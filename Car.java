package Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Car implements Comparable<Car>{
    String name ;
    int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.year, car.year);
    }
    @Override
    public String toString() {
        return "Model: " + name + ", Year: " + year;
    }

    public static void main(String[] args) {


    ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2001));
        cars.add(new Car("Audi", 2002));
        cars.add(new Car("Mercedes", 2003));
        cars.add(new Car("Ford", 2004));
        cars.add(new Car("Opel", 2005));
        cars.add(new Car("Honda", 2006));
        cars.add(new Car("Toyota", 2007));
        cars.add(new Car("Saab", 2008));
        cars.add(new Car("Mclaren", 2009));
        Collections.sort(cars);

        for (Car car: cars){
        System.out.println(car);
    }
    }

}
