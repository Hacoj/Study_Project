package lesson.generic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework01 {
    public static void main(String[] args) {}

    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1234561, 12, "胡桃"));
        userDAO.save("2",new User(1234562, 16, "申鹤"));
        userDAO.save("3",new User(1234563, 16, "优菈"));

        List<User> list = userDAO.list();
        for (User user_ : list) {
            System.out.println(user_);
        }
        System.out.println("===============================");

        userDAO.update("1", new User(1234567,16,"夜兰"));
        for (String str: userDAO.getMap().keySet()) {
            System.out.println(userDAO.getMap().get(str));
        }

        System.out.println("===============================");

        userDAO.delete("1");
        for (String str: userDAO.getMap().keySet()) {
            System.out.println(userDAO.getMap().get(str));
        }


    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    @org.junit.jupiter.api.Test
    public void save(String id, T entity)
    {
        map.put(id,entity);
    }
    @Test
    public T get(String id){

        for (String str: map.keySet()) {
            if(str == id){
                return map.get(id);
            }
        }
        return null;
    }
    @Test
    public void update(String id, T entity){
        map.put(id, entity);
    }
    @Test
    public List<T> list()
    {
        List<T> ts = new ArrayList<>();
        for (String str : map.keySet()) {
            ts.add(map.get(str));
        }
        return ts;
    }
    @Test
    public void delete(String id){
        map.remove(id);
    }
    @Test
    public Map<String, T> getMap() {
        return map;
    }
    @Test
    public void setMap(Map<String, T> map) {
        this.map = map;
    }
}

class User{
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
