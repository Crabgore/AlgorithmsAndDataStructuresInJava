package lesson_4;

import java.util.EmptyStackException;

public class MyLinkedQueue<Item> {
    private MyLinkedList<Item> list;

    public MyLinkedQueue() {
        list = new MyLinkedList<>();
    }

    public void insert(Item item) {
        list.insertLast(item);
    }

    public Item remove(){
        Item value = peek();
        list.removeFirst();
        return value;
    }

    public Item peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "MyQueue {" + list + "}";
    }
}
