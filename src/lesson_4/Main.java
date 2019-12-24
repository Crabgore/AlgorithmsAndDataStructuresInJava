package lesson_4;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        MyLinkedStack<Integer> stack = new MyLinkedStack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println(stack);
//
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(stack.pop());
//        }

//        MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();
//
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//
//        System.out.println(queue);
//
//        for (int i = 0; i < 4 ; i++) {
//            System.out.println(queue);
//            System.out.println(queue.remove());
//        }
//
//        System.out.println(queue);
//        queue.insert(1);
//        System.out.println(queue);
//        queue.insert(2);
//        System.out.println(queue);
//        queue.insert(3);
//        System.out.println(queue);
//        queue.insert(4);
//        System.out.println(queue);

//        MyLinkedList<String> mll= new MyLinkedList<>();
//
//        mll.insertFirst("Katia");
//        mll.insertFirst("Maria");
//        mll.insertFirst("Sania");
//
//        Iterator<String> iterator = mll.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        for (String s:mll ) {
//            System.out.println(s);
//        }

        MyLinkedList<String> mll= new MyLinkedList<>();

        mll.insertFirst("Katia");
        mll.insertFirst("Maria");
        mll.insertFirst("Sania");
        mll.insertFirst("Petia");
        mll.insertFirst("Fedia");

        System.out.println(mll);

        ListIterator<String> listIterator = mll.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
