package lesson_5;

public class Main {
    public static void main(String[] args) {
        System.out.println(degree(2, 8));
        System.out.println(recDegree(2, 8));
    }

    public static int degree (int n, int degree) {
        int value = 1;
        for (int i = 0; i < degree; i++) {
            value *= n;
        }
        return value;
    }

    public static int recDegree (int n, int degree) {
        if (degree == 1)
            return n;
        else if (degree < 1)
            return 1;

        if (n <= 0)
            return 0;

        return recDegree(n, degree - 1) * n;
    }
}
