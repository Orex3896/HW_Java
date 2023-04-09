package HW3.tack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }
    static void ex1(){
    List list = new ArrayList<>();
        list.add(55);
        list.add("234");
        list.add("привет");
        list.add("Пока");
        list.add(23423);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
        if(list.get(i) instanceof Integer){//если требуется ещё удалить и дабл то нужно использовать  Number так как это главнее integer
            list.remove(i);
            i--;//так как при удалении числа у нас меняется индекс тогда нужно его в этот момент откатить
        }
    }
        System.out.println(list);
}

    static void ex2(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(45);
        list.add(7);

        System.out.println("Наш массив  "+list);
        System.out.println("минимальное число из массива");
        System.out.println(Collections.min(list));
        System.out.println("максимальное число из массива");
        System.out.println(Collections.max(list));


        double sum =0;
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i);
        }
        System.out.println("Среднее арифмитическое");
        System.out.println(sum/list.size());
    }
}

