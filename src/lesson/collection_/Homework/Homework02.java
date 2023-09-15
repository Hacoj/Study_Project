package lesson.collection_.Homework;

import java.util.ArrayList;

public class Homework02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Car car1 = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        Car car3 = new Car("特斯拉", 200000);
        Car car4 = new Car("红旗", 50000000);
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);

        System.out.println(arrayList);

        arrayList.remove(1);

        System.out.println(arrayList.contains(car1));

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        ArrayList temp_list = new ArrayList(arrayList);
        arrayList.clear();

        System.out.println(arrayList);

        arrayList.addAll(temp_list);
        arrayList.add(car1);
        arrayList.add(car1);
        arrayList.add(car1);

        System.out.println(arrayList);

        System.out.println(arrayList.containsAll(temp_list));

        System.out.println(arrayList.removeAll(temp_list));
        System.out.println(arrayList);

    }
}
class Car{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
