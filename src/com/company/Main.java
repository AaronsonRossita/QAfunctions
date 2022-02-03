package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerName = new Scanner(System.in);
//        System.out.println("Pls write a word");
//
//        String s = scannerName.nextLine();
//
//        System.out.println("String s = " + s);
//
//        System.out.println("Pls write a number");
//        int newInt = scannerName.nextInt();
//        System.out.println("My new int = " + newInt);
//        sum() round(avg(),2) max() min() count()
//
//        int sumField = sum(5,4);
//        System.out.println(sumField);
//
//        System.out.println("mult = " + mult(2,4));
//
//        print();
//        printWord("Here is your word");
//        printNumber(45);
//        System.out.println("Pls give me the first number");
//        int a = scannerName.nextInt();
//        System.out.println("Pls give me the second number");
//        int b = scannerName.nextInt();
//        System.out.println("------------");
//        System.out.println(sum(a,b));

//        System.out.println(3+2);
//        System.out.println(3-2);
//        System.out.println(3*2);
//        System.out.println(3/2);
//        System.out.println(6%2);
//        System.out.println(13%5);

        System.out.println("Lets check if your number is even");
        System.out.println("Pls write your number");
        int x = scannerName.nextInt();
        if (isEven(x)){
            System.out.println("yes your number is even");
        }else{
            System.out.println("no your number is odd");
        }


    }

    static int sum(int a, int b){
//        int sum = 0;
//        sum = a + b;
//        return sum;
        return a + b;
    }

    static int mult(int a, int b){
//        int mult = 0;
//        mult = a * b;
//        return mult;
        return a * b;
    }

    static void print(){
        System.out.println("I'm in func print");
    }

    static void printWord(String newWord){
        System.out.println("The word you gave me is = " + newWord);
    }

    static void printNumber(int newNumber){
        System.out.println("This is the number you gave me " + newNumber);
    }

    static boolean isEven(int x){
        if (x % 2 == 0){
            return true;
        }else{
            return false;
        }
    }


}




