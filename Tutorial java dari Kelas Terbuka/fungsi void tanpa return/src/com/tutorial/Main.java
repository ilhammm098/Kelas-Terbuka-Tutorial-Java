package com.tutorial;
public class Main {
    public static void main(String[] args){
        // void itu artinya hampa
        System.out.println(simple());

        fungsiVoid("yahaha hayuk");

        selamatPagi("budi");
        selamatPagi("sasya");
    }
    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }
    //fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    //fungsi atau methode dengan kembalian sehingga menggunakan return untuk mengembalikan nilainya (10.0f)
    private static float simple(){
        return 10.0f;
    }
}