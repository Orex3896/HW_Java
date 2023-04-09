package tack_2;

public class TackJson {
    public static void parsString() {
        String str = "\"[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка$\":\"5\",\"предмет\":\"Физика\"}]\";\n";
        String[] students = str.replaceAll("\s","").split("\\},\\{");

        String str1 = str.replace(" ", "");
        String str2 = str1.replace("}", "");
        String str3 = str2.replace("]", "");
        // String[] strArr = str3.trim().split(",");
        // String[] students = str.trim().split(",");
        StringBuilder result = new StringBuilder();
        for(String student:students){
            String[] attributes = student.replaceAll("[{}\"]","").split(",");
            String name = attributes[0].split(":")[1];
            String star = attributes[1].split(":")[1];
            String predmet = attributes[2].split(":")[1];
            result.append("Студент ").append(name).append(" получил ").append(star).append(" по предмету ").append(predmet).append(".\n");
        }

        System.out.println(result);
//        for (int i = 0; i <strArr.length ; i++) {
//            System.out.println(strArr[i]);
//        }
//        StringBuilder outAraay = new StringBuilder();
//        for (int i = 0; i <strArr.length; i++) {
//            outAraay.append(strArr[i].split(":")[1]);
//        }

//       // System.out.println(outAraay);
//        String strAdd = "Студент, получил, по, предмету ";
//        //String strAdd1 = strAdd.replace(" ","");
//       // String strAdd1 = strAdd.replace("","");
//        String [] strArrAdd = strAdd.trim().split(",");
//        //System.out.print(strArrAdd[1]);
//        for (int i = 0; i<strArrAdd.length ; i++) {
//            for (int j = 0; j <strArr.length ; j++) {
//                System.out.println(strArrAdd[i]+strArr[j].split(":")[1]);

    }
    //System.out.print(strArrAdd[i]);
}
//
//        String name = strArr[0].split(":")[1];
//        String star = strArr[1].split(":")[1];
//        String predmet = strArr[2].split(":")[1];
//
//        System.out.println(name);
//        System.out.println(star);
//        arrSort(strArr);

//}

//    public static String [] arrSort(String[] array) {
//        String[] luckyFish = new String[array.length/2];
//        String a = ":";
//        for (int i = 0; i <array.length ; i++) {
//            if(array[i].contains(a)){
//                System.out.println(array[i]);
//            }
//
//        }
//
//
//            }
//
//        }
//
//        System.out.println("hi");
//        return array;}
//}

