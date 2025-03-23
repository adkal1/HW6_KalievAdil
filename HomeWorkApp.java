public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(5, 7);
        checkSumSign(-45, 5);

        printColor(120);
        printColor(-34);
        printColor(100);

        compareNumbers(12, -54);
        compareNumbers(-34, -34);


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The sum is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }

    public static void printColor(int val) {
        if (val <= 0) {
            System.out.println("Red");
        } else if (0 < val && val <= 100) {
            System.out.println("Yellow");
        } else if (val > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
