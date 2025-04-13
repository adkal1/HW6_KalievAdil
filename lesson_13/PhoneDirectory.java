package lesson_13;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Adil", "+77772320000");
        phoneDirectory.add("Tim", "+77773430000");
        phoneDirectory.add("Ali", "+77772322340");
        phoneDirectory.add("Vlad", "+77771234500");
        phoneDirectory.add("Sam", "+77098760000");

        System.out.println(phoneDirectory.get("Adil"));
        System.out.println(phoneDirectory.get("Tim"));
        System.out.println(phoneDirectory.get("Ali"));
        System.out.println(phoneDirectory.get("Vlad"));
        System.out.println(phoneDirectory.get("Sam"));
    }
}
