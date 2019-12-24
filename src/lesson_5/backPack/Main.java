package lesson_5.backPack;

public class Main {
    public static void main(String[] args) {
        String in = "Максимальная возможная стоимость товаров в рюкзаке: ";
        String currency = " условных единиц.";
        //стоимость, вес, количество товаров и грузоподъёмность рюкзака взял с картинки на странице Википедии
        int[] itemsValue = new int[] {4, 2, 10, 2, 1};
        int[] itemsWeight = new int[] {12, 1, 4, 2, 1};
        int maxWeight = 15;
        int itemsCount = itemsValue.length;
        System.out.println(in + backPack(itemsWeight, itemsValue, itemsCount, maxWeight) + currency);
    }

    public static int backPack(int[] itemsWeight, int[] itemsValue, int itemsCount, int maxWeight) {
        if (itemsCount <= 0) {
            return 0;
        }

        if (itemsWeight[itemsCount - 1] > maxWeight) {
            return backPack(itemsWeight, itemsValue, itemsCount - 1, maxWeight);
        } else {
            return Math.max(backPack(itemsWeight, itemsValue, itemsCount - 1, maxWeight), itemsValue[itemsCount - 1]
                    + backPack(itemsWeight, itemsValue, itemsCount - 1, maxWeight - itemsWeight[itemsCount - 1]));
        }
    }
}
