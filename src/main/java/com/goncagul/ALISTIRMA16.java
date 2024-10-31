package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA16 {
    public static void main(String[] args) {
        //* Problem: 5 elemanlı bir dizi oluşturun, kullanıcıdan elemanları alın ve bu dizinin ortalamasını hesaplayın.

        Scanner sc=new Scanner(System.in);

        int[] sayilar=new int[5];
        int toplam=0;
        int ortalama=0;
        for(int i=1;i<=sayilar.length;i++)
        {

            System.out.println("lütfen "+i+" nci sayıyı giriniz ");
            sayilar[i]=sc.nextInt();
            toplam+=sayilar[i];

        }
        ortalama= toplam/5;
        System.out.println("Dizi içeriisndeki değerlerin ortalaması "+ortalama);
    }
}
