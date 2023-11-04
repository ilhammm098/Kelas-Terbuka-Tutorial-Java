package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("ini adalah awal program");
        System.out.println("loop pertama");
        for(int nilai = 0; nilai <= 10; nilai++) {
            System.out.println("for loop ke-" + nilai);
        }

        System.out.println("for loop kedua");
        for(int nilai = 0; nilai < 10; nilai++){
            System.out.println("for loop ke-" + nilai);
        }

        System.out.println("for loop ke tiga");
        for(int nilai = 10; nilai >= 5; nilai--) {
            System.out.println("for loop ke-" + nilai);
        }
    }
}
