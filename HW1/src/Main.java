//Задача №1
//        Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
//        сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        int n = numbers.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (numbers[i - 1] < numbers[i]) {
                    int temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);


        // Задача 2
        // Написать точно такую же процедуру, но в декларативном стиле
        System.out.println(Arrays.toString(numbers));
        Integer[] numbers2 = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numbers2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers2));


    }


}
