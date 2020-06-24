package com.develogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "Unsafe";
        } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] queryParts = query.split(":");
            if (queryParts.length == 1) {
                return "";
            }
            String[] numbers = queryParts[1].split(",");
            if (numbers.length == 1) {
                return "";
            }
            int[] array = Arrays.asList(numbers).stream().mapToInt(Integer::parseInt).toArray();
            return Integer.toString(maxValue(array));
        } else if (query.toLowerCase().contains("minus")) {
            String transformedStr = query.replaceAll("[^-?0-9]+", " ");
            String[] numbers = transformedStr.trim().split(" ");
            int total = Integer.valueOf(numbers[0]);
            for (int i = 1; i<numbers.length; i++) {
                int  current = Integer.valueOf(numbers[i]);
                total = total - current;
            }
            return "" + total;
        } else if (query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus") ) {

            String transformedStr = query.replaceAll("[^-?0-9]+", " ");
            String[] numbers = transformedStr.trim().split(" ");
            int total = 0;
            for (int i = 0; i<numbers.length; i++) {
                int  current = Integer.valueOf(numbers[i]);
                total =+ current;
            }
            return "" + total;
        } else if (query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus") ) {

            String transformedStr = query.replaceAll("[^-?0-9]+", " ");
            String[] numbers = transformedStr.trim().split(" ");
            int total = 0;
            for (int i = 0; i<numbers.length; i++) {
                int  current = Integer.valueOf(numbers[i]);
                total =+ current;
            }
            return "" + total;
        } else if (query.toLowerCase().contains("banana")) {
            return "yellow";
        }

        return "";
    }

    public int maxValue(int array[]) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return Collections.max(list);
    }
}
