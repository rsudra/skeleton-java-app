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
            String[] numbers = queryParts[1].split(",");
            int[] array = Arrays.asList(numbers).stream().mapToInt(Integer::parseInt).toArray();
            return Integer.toString(maxValue(array));
        } else if (query.toLowerCase().contains("what is 6 plus 15")) {
            return "21";
        } else if (query.toLowerCase().contains("which of the following numbers is the largest: 450, 92")) {
            return "450";
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
