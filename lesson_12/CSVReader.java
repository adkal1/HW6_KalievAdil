package lesson_12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
    public AppData read(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String headerLine = reader.readLine();
            if (headerLine == null) return null;

            String[] header = headerLine.split(";");
            ArrayList<int[]> rows = new ArrayList<>();

            String line;
            while ((line = reader.readLine())!=null) {
                String[] parts = line.split(";");
                int[] intRow = new int[parts.length];
                for (int i=0; i< parts.length;i++){
                    intRow[i] = Integer.parseInt(parts[i]);
                }
                rows.add(intRow);
            }
            int[][] data = rows.toArray(new int[0][]);
            return new AppData(header, data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
