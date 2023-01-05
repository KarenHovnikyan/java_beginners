package com.company.CodingBat.Array3;

import java.util.Arrays;

public class SeriesUp {

    public  int[] seriesUp(int n) {
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

    public static void main(String[] args) {
        SeriesUp seriesUp = new SeriesUp();
        seriesUp.seriesUp(4);
        System.out.println(Arrays.toString(seriesUp.seriesUp(4)));
    }
}
