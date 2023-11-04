package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukkan nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah = " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiBenar == nilaiTebakan);
        System.out.println("tebakan anda = " + statusTebakan);

        //operasi aljabar boolean ( AND / OR)
        System.out.print("masukkan angka antara 4 dan 9 = ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("hasil tebakan = " + statusTebakan);

    }
}