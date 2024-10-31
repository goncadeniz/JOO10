package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA1 {
    public static void main(String[] args) {
        //Kullanıcıdan iki tamsayı alın ve bu sayıların toplamını, farkını, çarpımını ve bölümünü ekrana yazdıran bir program yazın.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz");
        int sayi1=new Scanner(System.in).nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz");
        int sayi2=new Scanner(System.in).nextInt();



        int toplam=sayi1+sayi2;
        int fark=sayi1-sayi2;
        int carpım=sayi1*sayi2;
        double bolum=sayi1/sayi2;

        System.out.println("Sayıların toplamı  "+toplam);
        System.out.println("Sayıların farkı "+fark);
        System.out.println("Sayıların çarpımı "+carpım);
        System.out.println("Sayıların bölümü  "+bolum);

    }
}
