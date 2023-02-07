package it.develhope.forloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Starting-----------------");

        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
        for (Integer fibonacciNumber: fibonacciNumbers) {
            System.out.println(fibonacciNumber);}

        System.out.println("---------------------------------------");

    }
}
