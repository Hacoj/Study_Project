package lesson.collection_.map_;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();

        Employee liu = new Employee(19000, "Liu", "123456789");
        Employee yue = new Employee(9000, "Yue", "123456788");
        Employee li = new Employee(29000, "Li", "123456787");
        map.put(li.getId(), li);
        map.put(liu.getId(), liu);
        map.put(yue.getId(), yue);

        System.out.println("====================================================");
        Set entrySet_ = map.entrySet();
        for (Object obj : entrySet_) {
            Map.Entry entry_ = (Map.Entry) obj;
            Employee temp = (Employee) (entry_.getValue());
            if (temp.getSalary() > 18000) {
                System.out.println(entry_.getKey() + "->" + entry_.getValue());
            }
        }
        System.out.println("====================================================");

        Iterator iterator1 = entrySet_.iterator();
        while (iterator1.hasNext()) {
            Object entry = iterator1.next();
            Map.Entry entry_ = (Map.Entry) entry;
            Employee temp = (Employee) (entry_.getValue());
            if (temp.getSalary() > 18000) {
                System.out.println(entry_.getKey() + "->" + entry_.getValue());
            }
        }
        System.out.println("====================================================");

        Set keySet_ = map.keySet();
        for (Object obj : keySet_) {
            Employee temp = (Employee) map.get(obj);
            if (temp.getSalary() > 18000) {
                System.out.println(obj + "->" + map.get(obj));
            }
        }
        System.out.println("====================================================");


        Iterator iterator2 = keySet_.iterator();
        while (iterator2.hasNext()) {
            Object obj = iterator2.next();
            Employee temp = (Employee) map.get(obj);
            if (temp.getSalary() > 18000) {
                System.out.println(obj + "->" + map.get(obj));
            }

        }
        System.out.println("====================================================");
    }
}

class Employee {
    private double salary;
    private String name;
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name, id);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public Employee(double salary, String name, String id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }
}
