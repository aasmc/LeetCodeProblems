package com.ru.aasmc;

import java.util.Arrays;

public class LeetCodeUtils {

    public static void printArray(int[] array) {
        Arrays.stream(array).
                forEach(i -> System.out.print(i + " "));
    }

    public static int[] reverseArray(int[] array) {
        int lastIndex = array.length - 1;
        for (int i = 0; i <= array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;
        }
        return array;
    }

    public static void printFuzzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int[] runningSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
        }
        return array;
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        int firstIndex = 0;
        int secondIndex = n;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[firstIndex++];
            } else {
                result[i] = nums[secondIndex++];
            }
        }
        return result;
    }
}
