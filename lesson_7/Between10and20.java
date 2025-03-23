package lesson_7;

public class Between10and20 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(34,-44));
    }
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
