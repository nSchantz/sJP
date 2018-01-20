package com.company;

public class Main {

    public static void main(String[] args) {
        fibonacciSet(5);


    }

    public static void fibonacciSet(int runTimes) {
        int x = 1;
        int y = 1;
        int z = 1;
        int i = 0;

        /*
        1 + 1 = 2, 2 + 1 = 3, 3 + 2 = 5

        x + y = z, z + x = y, y + z = x + y
        */

        for(i = 0; i < runTimes; i++){
            z = x + y;
            System.out.println(z);
            y = z + x;
            System.out.println(y);
            x = y + z;
            System.out.println(x);
        }




    }
}
