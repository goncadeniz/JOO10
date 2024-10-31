package com.goncagul;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ALISTIRMA14 {
    public static void main(String[] args) {
   //Problem: Kullanıcıdan bir sayı alın ve bu sayıya kadar olan çift
   // sayıları ekrana yazdıran bir program yazın.

        Scanner sc=new Scanner(System.in);
        System.out.println("lÜTFEN BİR SAYI GİRİNİZ ");
        int sayi=sc.nextInt();
        for (int i=1;i<=sayi;i++)
        {
            if(i%2==0)
            {
                System.out.println(i  +"sayısı çifttir");
            }
            else
            {
                System.out.println("sayı tektir ");
            }
        }
    }
}
