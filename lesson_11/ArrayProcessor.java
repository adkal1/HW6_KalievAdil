package lesson_11;

public class ArrayProcessor {
    public static int processArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Array should have 4 rows");
        }
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("Row should have 4 columns");
            }
        }
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    s += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Invalid data at cell [" + i + "]" + j + "]: '" + arr[i][j] + "'");
                }
            }
        }

        return s;
    }
}
