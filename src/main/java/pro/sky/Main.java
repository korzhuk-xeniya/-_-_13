package pro.sky;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static pro.sky.Users.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Users> persons = new ArrayList<>();
        persons.add(new Users("tarun", 28));
        persons.add(new Users("arun", 29));
        persons.add(new Users("varun", 12));
        persons.add(new Users("arun", 22));

        List<Users> persons2 = sorter(persons);

        System.out.println(persons2);
        Optional<Users> userWithMaxAge = findMaxAge(removeDuplicates(persons));
        System.out.println(userWithMaxAge);

    }
}

