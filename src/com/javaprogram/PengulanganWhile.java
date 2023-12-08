package com.javaprogram;

public class PengulanganWhile {
    public static void main(String[] args) {

        int a = 0;
        boolean kondisi = true;

        while(kondisi){
            System.out.println("while loop ke-"+a);
            a++; // nilai a=1 + 1 = 2
            if(a==15){
                kondisi=false;
            }
        }
    }
}
