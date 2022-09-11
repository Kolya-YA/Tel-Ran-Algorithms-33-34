package edu.telran.homework.hw03;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSort(rndArr(10))));
        System.out.println(Arrays.toString(bubbleSort(rndArr(18))));
        System.out.println(Arrays.toString(bubbleSort(rndArr(100))));
    }

    private static int[] bubbleSort(int[] intArr) {
        System.out.println(Arrays.toString(intArr));
        boolean isSwapped;
        do {
            isSwapped = false;
            for (int i = 0; i < intArr.length - 1; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    int tmp = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = tmp;
                    isSwapped = true;
                }
            }
        } while (isSwapped);

        return intArr;
    }

    private static int[] rndArr(int arrLength) {
        return IntStream.generate(() -> new Random().nextInt(100)).limit(arrLength).toArray();
    }
}
