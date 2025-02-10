package STEP10;

public class fruit_basket {
    public static int totalFruits(Integer[] arr) {
        int basket1 = 1;
        int fruit1 = arr[0];
        int lastOccurringIndex1 = 0;
        int basket2 = 0;
        int fruit2 = 0;
        int lastOccurringIndex2 = 0;
        int iterator = 1;
        while (iterator < arr.length && arr[iterator] == fruit1) {
            ++basket1;
            lastOccurringIndex1 = iterator;
            ++iterator;
        }
        if (iterator < arr.length) {
            fruit2 = arr[iterator];
            lastOccurringIndex2 = iterator;
            ++basket2;
        }
        for (int i = iterator + 1; i < arr.length; i++) {
            if (arr[i] == fruit1) {
                ++basket1;
                lastOccurringIndex1 = i;
            } else if (arr[i] == fruit2) {
                ++basket2;
                lastOccurringIndex2 = i;
            } else {
                if (lastOccurringIndex1 > lastOccurringIndex2) {
                    basket1 = lastOccurringIndex1 - lastOccurringIndex2 + 1;
                    basket2 = 1;
                    lastOccurringIndex2 = i;
                    fruit2 = arr[i];
                } else {
                    basket2 = lastOccurringIndex2 - lastOccurringIndex1 + 1;
                    basket1 = 1;
                    lastOccurringIndex1 = i;
                    fruit1 = arr[i];
                }
            }

        }return basket1+basket2;

    }
}
