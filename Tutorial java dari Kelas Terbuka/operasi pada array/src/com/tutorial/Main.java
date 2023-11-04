package com.tutorial;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int[] arrayAngka1 = {1,2,3,4,5};

        //merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n======================");
        printArray(arrayAngka1);

        //mengkopi array
        System.out.println("\nMengkopi array\n======================");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("mengkopi dengan loop");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nMengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,5);
        printArray(arrayAngka1);
        printArray(arrayAngka3);

        System.out.println("\nMengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nFill Array\n=================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 4);
        printArray(arrayAngka5);

        //komparasi array
        System.out.println("\nKomparasi array\n============");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};

        System.out.println("\nMembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));

        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("sama");
        }else{
            System.out.println("beda");
        }

        System.out.println("\nMengecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nMengecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        //sort array
        System.out.println("\nsort array\n===================");
        int[] arrayAngka8 = {7,3,6,8,3,5,6,5};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search array
        System.out.println("\nSearch array\n================");
        int angka = 2;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

        //tugas
        // 1. sort array dari yang terbesar
        // 2. operasi tambah antara dua buah array
        // 3. menggabungkan dua buah array

    }
    private static void printArray(int[] dataArray){
        System.out.println("array = " +Arrays.toString(dataArray));
    }
}