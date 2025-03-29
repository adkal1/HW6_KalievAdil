package lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions = new ArrayList<>();

    class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
    }

    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }
}

