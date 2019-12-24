package lesson_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int capacity = 1000000;
        long curTime;

        MyArrayList<Integer> mal = new MyArrayList<>(5);

        fillIn(mal, capacity);
        curTime = System.currentTimeMillis();
        mal.selectionSort();
        calculateTime(curTime, "Методом выбора");

        mal = new MyArrayList<>(capacity);
        fillIn(mal, capacity);
        curTime = System.currentTimeMillis();
        mal.insertionSort();
        calculateTime(curTime, "Методом вставки");

        mal = new MyArrayList<>(capacity);
        fillIn(mal, capacity);
        curTime = System.currentTimeMillis();
        mal.bubbleSort();
        calculateTime(curTime, "Пузырьковая");
    }

    private static void calculateTime(long curTime1, String string) {
        long curTime2 = System.currentTimeMillis();
        long result = curTime2 - curTime1;
        System.out.println(string + " сортировка заняла " + result);
    }

    private static void fillIn(MyArrayList<Integer> mal, int capacity) {
        Random random= new Random();
        for (int i = 0; i < capacity; i++) {
            mal.add(random.nextInt(100000));
        }
    }
}
