package com.javaprogram;

public class PengulanganDoWhile {
    public static void main(String[] args) {
//        do{
//            aksi
//        }while (kondis);

        System.out.println("ini adalah awal program");

        int a=0;
        boolean kondisi=true;
        do{
            a++;
            System.out.println("do while ke-"+a);
            if(a==3){
                kondisi=false;
            }
        }while (kondisi);

        System.out.println("ini adalah akhir program");
    }
}
