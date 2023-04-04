package tack;

public class Tack_3 {
    public static String Arr() {

        String Nums = "2, 3, 5, 7,";
            for (int i = 8; 1 <= 1000;i++){
                if (isSimple(i) != 0){
            Nums += i + " ";
        }
            }
        //return Nums;
    }
        public static int isSimple ( int m){
            if (m % 2 == 0 || m % 3 == 0 || m % 5 == 0 || m % 7 == 0){
            return 0;
        }
            else{
            return m;
                }
    }
    }




