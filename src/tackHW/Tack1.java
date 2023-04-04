package tackHW;
//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат посл е каждой итерации запишите в лог-файл.
import tack_2.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tack1 {
    private static final Logger LOG = Log.log(tackHW.Tack1.class.getName());
    public static void writeIteration(int[] arr) {
        try (FileWriter in = new FileWriter("hw2.txt")) {
            String message;
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    message = Arrays.toString(arr);
                    LOG.log(Level.INFO, message);
                }
            }

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);

        }
    }
}



