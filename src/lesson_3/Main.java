package lesson_3;

public class Main {
    public static void main(String[] args) {
//        MyStack<String> myStack = new MyStack<>();
//
//        myStack.push("One");
//        myStack.push("Two");
//        myStack.push("Three");
//        myStack.push("Four");
//        myStack.push("Five");
//
//        System.out.println(myStack);
//
//        for (int i = myStack.size(); i > 0; i--) {
//            System.out.println(myStack.pop());
//        }

        MyDeque<Integer> myDeque = new MyDeque<>(10);

        myDeque.insertLeft(1);
        System.out.println(myDeque);
        myDeque.insertLeft(2);
        System.out.println(myDeque);
        myDeque.insertLeft(3);
        System.out.println(myDeque);

        myDeque.insertRight(11);
        System.out.println(myDeque);
        myDeque.insertRight(12);
        System.out.println(myDeque);
        myDeque.insertRight(13);
        System.out.println(myDeque);
        myDeque.insertRight(14);
        System.out.println(myDeque);
        myDeque.insertRight(15);
        System.out.println(myDeque);

        System.out.println(myDeque.removeLeft());
        System.out.println(myDeque);
        System.out.println(myDeque.removeLeft());
        System.out.println(myDeque);
        System.out.println(myDeque.removeLeft());
        System.out.println(myDeque);

        System.out.println(myDeque.removeRight());
        System.out.println(myDeque);
        System.out.println(myDeque.removeRight());
        System.out.println(myDeque);
        System.out.println(myDeque.removeRight());
        System.out.println(myDeque);
    }
}
