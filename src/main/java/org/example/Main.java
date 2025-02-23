package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        String input = scanner.nextLine();
        if (input.equals("*")) {
            System.out.println(carpma(3,4));
        } else {
            System.out.println(toplama(3,4));
        }

    }
    public static int carpma(int a,int b){
        return a*b;
    }
    public static int toplama(int a,int b){
        return a+b;
    }

}