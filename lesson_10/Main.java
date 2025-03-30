package lesson_10;

public class Main {
    public static <T> void swapElements(T[] array, int i, int j) {
        if (i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IndexOutOfBoundsException("Invalid inices");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        System.out.println("Apple Box Weight: " + appleBox.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());
        System.out.println("Are the boxes equal? " + appleBox.compare(orangeBox));

        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruitsTo(anotherAppleBox);
        System.out.println("Apple Box Weight after transfer: " + appleBox.getWeight());
        System.out.println("Another Apple Box Weight: " + anotherAppleBox.getWeight());

        Integer[] numbers = {1, 2, 3, 4};
        String[] letters = {"a", "b", "c", "d"};
        swapElements(numbers, 1, 3);
        swapElements(letters, 1, 3);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        for (String l : letters) {
            System.out.print(l + " ");
        }


    }
}
