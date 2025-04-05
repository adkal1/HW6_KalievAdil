package lesson_11;

public class Main {
    public static void checkArray(String[][] arr) {
        try {
            int result = ArrayProcessor.processArray(arr);
            System.out.println("Sum is: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[][] firstArray = {{"6", "2", "3", "4"}, {"3", "6", "2", "0"}, {"9", "8", "7", "6"}, {"2", "1", "3", "4"}};
        String[][] secondArray = {{"6", "2", "3", "4"}, {"3", "6", "2", "0"}, {"9", "e", "7", "6"}, {"2", "1", "3", "4"}};
        String[][] thirdArray = {{"6", "2", "3", "4"}, {"3", "6", "2", "0"}};
        checkArray(firstArray);
        checkArray(secondArray);
        checkArray(thirdArray);
    }
}
