package edu.telran.homework.hw01;

public class Main {
    public static void main(String[] args) {
        int[] arr01 = {1, 1, 2, 2, 3, 4, 4, 5, 5}; // 3 at the middle of array
        int[] arr02 = {1, 2, 2, 3, 3, 4, 4, 5, 5}; // 1 at the start of array
        int[] arr03 = {1, 1, 2, 2, 3, 3, 4, 4, 5}; // 5 at the end of array

        System.out.println(findSingle(arr01));
        System.out.println(findSingle(arr02));
        System.out.println(findSingle(arr03));
    }

    private static int findSingle(int[] intArr) {

        for (int i = 0; i < intArr.length - 2; i += 2) {
            if (intArr[i] != intArr[i + 1]) {
                return intArr[i];
            }
        }

        return intArr[intArr.length - 1];
    }
}
