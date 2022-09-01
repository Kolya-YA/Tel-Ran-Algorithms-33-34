package edu.telran.homework.hw02;

public class Main {
    public static void main(String[] args) {
        System.out.println(findGCD(12, 18));
        System.out.println(findGCD(100, 151));
        System.out.println(findGCD(13, 197));
        System.out.println(findGCD(185, 111));
    }

    private static int findGCD(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
