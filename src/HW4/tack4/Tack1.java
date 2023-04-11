package HW4.tack4;

import java.util.LinkedList;

public class Tack1 {
    public static void ex0() {

            LinkedList<Integer> list = new LinkedList<>();//создаем лист для его заполнения
            LinkedList<Integer> list1 = new LinkedList<>();//создаем лист1 для того чтоб поместить туда перевёрнутый лист
            list.add(5);//заполняем
            list.add(54);
            list.add(3);
            list.add(2);

            for (int i = list.size() - 1; i >= 0; i--) {//цикл for с конца
                list1.add(list.get(i));//добавляем при каждой итерации в лист1 значения лист
            }
            System.out.println("list = "+list);
            System.out.println("list1 revers= "+list1);
        }
    }

