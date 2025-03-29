package lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> items = new ArrayList<>();

    class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }
}