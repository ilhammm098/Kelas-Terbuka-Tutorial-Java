package com.tutorial;
import java.sql.SQLOutput;
import java.util.*;
public class forLoop {
    public static void main(String[] args){
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        for(total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
           total =  total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);

        }
    }
}
