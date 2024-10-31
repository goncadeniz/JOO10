package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA7 {
    public static void main(String[] args) {
        // Bir öğrencinin notunu (0-100 arası) kullanıcıdan alın
        // ve 50’den büyükse “Geçti”, küçükse “Kaldı” şeklinde sonuç yazdırın.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen notunuzu (0-100 arası ) giriniz");
        int not=sc.nextInt();
        if(not>=50 )
        {
            System.out.println("Geçtiniz");
        }
        else
        {
            System.out.println("Kaldınız");
        }

    }
}
