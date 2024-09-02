package com.xworkz.inherite.things;
//import java.util.Arrays;


public class ThalaForReason {

    public static void findPairs(int[] array, int target) {
        System.out.println("Pairs:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("[" + array[i] + "," + array[j] + "]");
                }
            }
        }
    }

    public static void findTrios(int[] array, int target) {
        System.out.println("\nTrios:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target) {
                        System.out.println("[" + array[i] + "," + array[j] + "," + array[k] + "]");
                    }
                }
            }
        }
    }
}


