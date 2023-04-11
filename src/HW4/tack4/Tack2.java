package HW4.tack4;
import tackHW.Task2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class Tack2 {
    public static void exQueue() {

        Queue<String> queue = Tack2.createdQueue();
        System.out.println("Hello, this queue");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

    }

    public static void exDeque() {
        Deque<String> deque = Tack2.createdDeque();
        System.out.println("Hello, this deque");
        deque.add("sdfsdf");//добавили элемент
        System.out.println(deque);//вывели
        System.out.println(deque.removeFirst());//возвращает и удаляет первый элемент
        System.out.println(deque);//вывод
    }

    public static void exFirst() {
        Deque<String> deque = Tack2.createdDeque();
        System.out.println(deque);
        System.out.println("возврат первого элемента");
        System.out.println(deque.getFirst());
        System.out.println(deque);
    }

    public static Deque<String> createdDeque() {
        Deque<String> deque = new LinkedList<>();
        deque.add("aaa");
        deque.add("bbb");
        deque.add("ccc");
        System.out.println(deque);
        return deque;
    }
    public static Queue<String> createdQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        System.out.println(queue);
        return queue;
    }


    }

