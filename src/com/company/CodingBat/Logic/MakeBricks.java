package com.company.CodingBat.Logic;

public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        return !((((big * 5 + small - goal) % 5) - small > 0));
    }

        public static void main (String[]args){
            MakeBricks makeBricks = new MakeBricks();
            System.out.println(makeBricks.makeBricks(3, 2, 10));
        }
    }

