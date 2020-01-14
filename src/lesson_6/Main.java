package lesson_6;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            for (int j = 0; j < 6; j++) {
                int max = 100;
                int min = -100;
                int range = max - min + 1;
                int count = (int)(Math.random() * range) + min;
                System.out.println(count);
                map.put(count, count);
            }
            System.out.println(map);
            System.out.println(map.size());
            System.out.println(map.height());
            System.out.println(map.isBalanced());
        }
    }
}
