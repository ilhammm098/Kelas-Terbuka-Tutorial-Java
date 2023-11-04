package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        //perkalian atau pembagian akan di lakukan terlebih dahulu

        // jika dilakukan perkalian dan pembagian, maka akan dilakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan ()
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner inputUser = new Scanner(System.in);
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;
        System.out.print("nilai x = ");
        x = inputUser.nextInt();
        System.out.print("gradien m = ");
        m = inputUser.nextInt();
        System.out.print("bias c = ");
        c = inputUser.nextInt();
        int y = (m * x * x) + c;
        System.out.println("nilai y = " + y);


    }
}