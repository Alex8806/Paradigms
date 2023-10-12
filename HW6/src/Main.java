//Ваша задача
//        Написать программу на любом языке в любой парадигме для
//        бинарного поиска. На вход подаётся целочисленный массив и
//        число. На выходе - индекс элемента или -1, в случае если искомого
//        элемента нет в массиве.


public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int ser = 1;
        System.out.println("Эллемент - " + ser + " имеет индекс - " + binarySearch(arr, ser));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}