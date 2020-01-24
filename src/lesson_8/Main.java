package lesson_8;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>();

//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(3,"three");
//        map.put(4,"four");
//        map.put(5,"five");
//
//        System.out.println(map);
//        System.out.println(map.get(4));
//
//        System.out.println(map.remove(4));
//        System.out.println(map);
//
//        map.put(6,"six");
//        map.put(10,"ten");
//        System.out.println(map);
//
//        map.put(4,"four!!!");
//        System.out.println(map);

        for (int i = 0; i < 90; i++) {
            map.put(i, String.valueOf(i));
        }
        System.out.println(map);

        System.out.println(map.remove(15));
        System.out.println(map.remove(42));
        System.out.println(map.remove(55));
        System.out.println(map.remove(74));
        System.out.println(map);
    }
}
