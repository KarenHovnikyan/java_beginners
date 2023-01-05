package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(seriesUp(4)));

    }

    public static int[] seriesUp(int n) {
        int[] numArray = new int[n*(n+1)/2];
        for (int i = 0, k = 1, l = 1; i < numArray.length; i++) {
            numArray[i] = k;
            if(k == l) {   k = 1; l++;
            } else {
                k++;
            }

        }

        return numArray;
    }
}

