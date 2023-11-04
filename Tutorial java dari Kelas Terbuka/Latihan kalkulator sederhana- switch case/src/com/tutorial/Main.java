package com.tutorial;

import java.util.*;
public class Main {
    public static void main(String[] args){
        float a ,b,hasil;
        String operator;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch (operator) {
            case "+" :
                hasil = a + b;
                System.out.printf("%f + %f = %f", a,b,hasil);
                break;
            case "-" :
                hasil = a - b;
                System.out.printf("%f - %f = %f",a,b,hasil);
                break;
            case "*" :
                hasil = a * b;
                System.out.printf("%f * %f = %f",a,b,hasil);
                break;
                case "/":
                hasil = a / b;
                System.out.printf("%f / %f = %f",a,b,hasil);
                break;
            default :
                System.out.println("operator yang di input tidak tersedia");
        }
    }
}