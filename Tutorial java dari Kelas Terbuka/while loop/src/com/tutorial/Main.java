package com.tutorial;

public class Main {
    public static void main(String[] args){
        int a = 0;
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("while loop ke-" + a);
            a++;

            if (a == 10) {
                kondisi = false;
            }
        }
    }
}
