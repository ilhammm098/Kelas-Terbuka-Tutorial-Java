package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        float a,b,hasil;
        char operator;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();


        if (operator == '+') {
            hasil = a + b;
            System.out.printf("%f + %f = %f",a , b ,hasil);
        } else if(operator == '-'){
            hasil = a - b;
            System.out.printf("%f - %f = %f",a, b, hasil);
        } else if(operator == '*'){
            hasil = a * b;
            System.out.printf("%f * %f = %f",a,b,hasil);
        }else if(operator == '/') {
            if(b == 0){
                System.out.println("hasil akan infinity jika di bagi 0");
            }else {
                hasil = a / b;
                System.out.printf("%f / %f = %f",a,b,hasil);
            }
        }else {
            System.out.println("operator yang di masukkan tidak tersedia");
        }



    }
}