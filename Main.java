package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String program = new String();

        System.out.println("What program do you want to run? (Case sensitive input)");
        program = input.next();

        fibonacciSet(25);

    }

    public static void fibonacciSet(int runTimes) {
        int x = 1;
        int y = 1;
        int z = 1;
        int empty = 0;
        int i = 0;
        /*
        1 + 1 = 2, 2 + 1 = 3, 3 + 2 = 5

        x + y = z, z + x = y, y + z = x + y
        */
        for(i = 0; i < runTimes; i++){
            //Version 2, Simplified:
            z = x + y;
            System.out.println(z);
            empty = z;
            z = x;
            x = y;
            y = empty;

            /*
            Version 1:
            z = x + y;
            System.out.println(z);
            y = z + x;
            System.out.println(y);
            x = y + z;
            System.out.println(x);
            */
        }
    }

    public static void calculator(){
        Scanner operationSelection = new Scanner(System.in);
        String operationName = new String();

        System.out.println("What operation do you want to perform: Addition, Subtraction, Multiplication, Division");
        operationName = operationSelection.next();
        operationName.toLowerCase();

        switch(operationName){
            case "addition":
                calcAddition();
                break;
            case "subtraction":
                calcSubtraction();
                break;
            case "multiplication":
                calcMultiplication();
                break;
            case "division":
                calcDivision();
                break;
            default:
                System.out.println("That is not an operation.");
        }
    }

    public static void calcAddition(){
        Scanner s = new Scanner(System.in);

    }

    public static void calcSubtraction(){
        Scanner s = new Scanner(System.in);

    }

    public static void calcMultiplication(){
        Scanner s = new Scanner(System.in);

    }

    public static void calcDivision(){
        Scanner s = new Scanner(System.in);

    }
}
