package pro.sky;

import java.util.*;
import java.util.stream.Collectors;

public class Users {
    private String name;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static ArrayList<Users> removeDuplicates(ArrayList<Users> list) {
        ArrayList<Users> newList = new ArrayList<Users>();
        for (Users element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static List<Users> sorter(ArrayList<Users> list) {
        return removeDuplicates(list).stream()
                .sorted(Comparator.comparing(Users::getAge)
                        .thenComparing(Comparator.comparing(Users::getName)))
                .collect(Collectors.toList());
    }

    public static Optional<Users> findMaxAge(ArrayList<Users> list) {
        return removeDuplicates(list)
                .stream()
                .max(Comparator.comparingInt(Users::getAge));

    }
}



