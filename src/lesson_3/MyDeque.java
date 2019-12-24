package lesson_3;

import java.util.Arrays;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("wrong capacity " + capacity);
        } else {
            list = (T[]) new Object[capacity];
        }
    }

    public MyDeque() {
        int DEFAULT_CAPACITY = 10;
        this.list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T item){
        if (isFull()) {
            throw new StackOverflowError("Дек переполнен.");
        }
        size++;
        list[begin] = item;
        begin = nextIndex(begin);
    }

    public void insertRight(T item){
        if (isFull()) {
            throw new StackOverflowError("Дек переполнен.");
        }
        size++;
        end = previousIndex(end);
        list[end] = item;
        for (int i = end; i < list.length-1; i++) {
            swap(i, i+1);
        }
    }

    public T removeLeft(){
        T temp = peekLeft();
        size--;
        list[0] = null;
        for (int i = 0; i < begin; i++) {
            swap(i, i+1);
        }
        begin = previousIndex(begin);
        return temp;
    }

    public T removeRight(){
        T temp = peekRight();
        size--;
        list[list.length-1] = null;
        for (int i = list.length-1; i > end; i--) {
            swap(i, i-1);
        }
        end = nextIndex(end);
        return temp;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int previousIndex(int index) {
        return (index - 1) >= 0? index - 1 : list.length - 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public T peekLeft() {
        if (isEmpty()) {
            return null;
        }
//        return list[begin-1];
        return list[0];
    }

    public T peekRight() {
        if (isEmpty()) {
            return null;
        }
        return list[list.length-1];
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "begin=" + begin +
                ", end=" + end +
                '}' + Arrays.toString(list);
    }
}
