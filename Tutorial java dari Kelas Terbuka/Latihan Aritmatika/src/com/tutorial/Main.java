package com.tutorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int panjang, lebar, luas;
        Scanner userInput = new Scanner(System.in);

        System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

    }
}