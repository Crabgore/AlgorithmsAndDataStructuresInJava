package lesson_3;

import java.util.Arrays;

public class Deq {
    int size;
    int head;
    int tail;
    int[] data;

    Deq(int size) {
        data = new int [this.size = size];
    }

    void pushBack(int value) {
        if (++tail == size)
            tail = 0;
        data[tail] = value;
    }

    int popBack() {
        int ret = data[tail];
        if (--tail < 0)
            tail = size - 1;
        return ret;
    }

    void pushFront(int value) {
        data[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    int popFront() {
        if (++head == size)
            head = 0;
        return data[head];
    }

    boolean isEmpty() {
        return head == tail;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "begin=" + head +
                ", end=" + tail +
                '}' + Arrays.toString(data);
    }
}
