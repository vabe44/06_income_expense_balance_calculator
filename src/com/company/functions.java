package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by GTX on 20/02/2017.
 */
public class functions {

    static void array_fill(ArrayList<Integer> list, Scanner konzol) {

        int value;
        do {
            value = konzol.nextInt();
            list.add(value);
        } while (value != 0);

    }

    static int array_getsum(ArrayList<Integer> list) {
        int sum = 0;
        for(Integer d : list)
            sum += d;
        return sum;
    }

    static int array_getmax(ArrayList<Integer> list) {
        int i;
        int max = list.get(0);
        for (i=0; i<list.size() ;i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }
}
