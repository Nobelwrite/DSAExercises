package com.dineshalgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveEvenNumber {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 4, 7, 10, 6, 5};

        // System.out.println("Odd numbers in the array:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Odd numbers in our array: " + number);

            }
        }
    }
}
