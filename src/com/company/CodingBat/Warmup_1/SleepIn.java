package com.company.CodingBat.Warmup_1;

public class SleepIn {
    public static boolean sleep(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
       boolean result =  sleep(true,true);

       System.out.println(result);
    }
}
