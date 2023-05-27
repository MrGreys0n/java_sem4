package prac1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<int[], Integer> function = a -> {
            int x, y, temp;
            x = a[0];
            y = a[1];
            while (y > 0) {
                temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        };
        System.out.println(function.apply(new int[]{12, 16}));
    }
}
