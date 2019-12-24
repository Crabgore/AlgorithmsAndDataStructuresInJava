package lesson_4;

import java.util.EmptyStackException;

public class MyLinkedStack<Item> {
    private MyLinkedList<Item> list;

    public MyLinkedStack() {
        list = new MyLinkedList<>();
    }

    public void push(Item item){
        list.insertLast(item);
    }

    public Item pop(){
        Item temp = peek();
        list.removeLast();
        return temp;
    }

    public Item peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "MyStack " + list;
    }
}
