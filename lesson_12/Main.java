package lesson_12;

public class Main {
    public static void main(String[] args) {
        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{12, 3, 4}, {2, 4, 5}, {6, 7, 8}};
        AppData appData = new AppData(headers, data);
        CSVWriter writer = new CSVWriter();
        writer.save(appData, "data.csv");
        CSVReader reader = new CSVReader();
        AppData loaded = reader.read("data.csv");
        for (String value : loaded.getHeader()) {
            System.out.println(value + " ");
        }
        for (int[] row : loaded.getData()) {
            for (int value : row) {
                System.out.println(value + " ");
            }
            System.out.println();
        }
    }
}
