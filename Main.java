package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String program = new String();

       // System.out.println("What program do you want to run? (Case sensitive input)");
       //5 program = input.next();

        calculator();

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
        Scanner selection = new Scanner(System.in);
        String operationName = new String();
        int num1 = 0;
        int num2 = 0;

        System.out.println("Enter number one into calculator");
        num1 = selection.nextInt();

        System.out.println("Enter number two into calculator");
        num2 = selection.nextInt();

        System.out.println("What operation do you want to perform: Addition (A), Subtraction (S), Multiplication (M), Division (D)");
        operationName = selection.next();
        operationName = operationName.toLowerCase();

        switch(operationName){
            case "addition": case "a":
                System.out.println(num1 + " + " + num2 + " = " + calcAddition(num1, num2));
                break;
            case "subtraction": case "s":
                System.out.println(num1 + " - " + num2 + " = " + calcSubtraction(num1, num2));
                break;
            case "multiplication": case "m":
                System.out.println(num1 + " * " + num2 + " = " + calcMultiplication(num1, num2));
                break;
            case "division": case "d":
                System.out.println(num1 + " / " + num2 + " = " + calcDivision(num1, num2) + " (Rounded)5");
                break;
            default:
                System.out.println("That is not an operation.");
        }
    }

    public static int calcAddition(int num1, int num2){
        return num1 + num2;
    }

    public static int calcSubtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int calcMultiplication(int num1, int num2){
        return num1 * num2;
    }

    public static int calcDivision(int num1, int num2){
        return (int) ((num1 / num2) + .5);
    }
}
