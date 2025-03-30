package lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) return 0;
        float weightPerFruit = fruits.get(0) instanceof Apple ? 1.0f : 1.5f;
        return weightPerFruit*fruits.size();
    }


    public boolean compare(Box<?> obj) {
        return Float.compare(this.getWeight(), obj.getWeight()) == 0;
    }
    public void transferFruitsTo(Box<T> obj) {
        if (this == obj) return;
        obj.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

}
