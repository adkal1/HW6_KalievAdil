package lesson_9;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Bobik");
        Cat catMurzik = new Cat("Murzik");

        dogBobik.run(150);
        dogBobik.swim(5);
        catMurzik.run(100);
        catMurzik.swim(5);

        Bowl bowl = new Bowl(20);
        Cat[] cats = {new Cat("Barsik"), new Cat("Vasya"), new Cat("Murka")};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }
    }
}
