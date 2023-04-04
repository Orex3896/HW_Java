package tack_2;

import java.io.FileWriter;
import java.io.IOException;

public class Tack_2 {

    public static void createdFile() {
        String str = buildString();
        try
            (FileWriter in = new FileWriter("test.txt")){
            in.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static String buildString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <100 ; i++) {
            builder.append("TEST");
        }
        return builder.toString();
        //return "TEST".repeat(100);//короткая запись
    }
}
