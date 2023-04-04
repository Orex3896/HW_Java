package tack_2;

import java.util.Scanner;

public class Tack_1 {
    public static String print_string(int n, char c1, char c2) {

        StringBuilder str = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n/2; i++) {
                str.append(c1);
                str.append(c2);
            }

            if(n % 2 != 0){
                str.append(c1);
            }
              }
            return str.toString();
    }
}

