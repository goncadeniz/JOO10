package com.goncagul;

import java.util.Scanner;

public class SORULAR4 {
    public static void main(String[] args) {
        int toplam=0;
        int enBuyuk=0;
        int enKucuk=0;
        double  ortalama=0;
        int adet=0;
        int sayi;
        do{

            System.out.println("""
                
                Kullanıcıdan 0-100 arası bir sayı girmesini isteyeceksiniz. Bu sayılar dışında
                 bir değer girer ise girilen sayı sınır dışında bir sayıdır uyarısı vereceksiniz. 
                 Temel kural olarak Kullanıcının girdiği geçerli sayıların toplamı 100 ü geçtiğinde 
                 sayı istemeyi durduracaksınız. Kullanıcıdan alınan sayıların en büyük olanı, en küçük olanı 
                 ve ortalamasını hesaplayan kodu yazınız.
               
                Örn:
                
                Sayı gir…: 5
                
                Sayı gir…: 12
                
                Sayı gir…: 55
                
                Sayı gir…: 43
                
                Max: 55
                
                Min: 5
                
                Ort: 28.75

                """);
            Scanner sc=new Scanner(System.in);
            System.out.println("Lütfen 0-100 ARASINDA  bir sayı giriniz ");
             sayi=sc.nextInt();
            if(sayi>100)
            {
                System.out.println("Girilen sayı 0-100 aralığı dışındadır.Lütfen tekrar bir sayı giriniz ");
                sayi=sc.nextInt();
            }
            else
            {
                toplam+=sayi;
                adet++;
            }



        }while(!(toplam>100));
        if(enBuyuk<sayi)
        {
            enBuyuk=sayi;
        }
        if(enKucuk<sayi)
        {
            enKucuk=sayi;
        }
        ortalama=toplam/adet;
        System.out.println("en büyük sayı "+enBuyuk);
        System.out.println( "en küçük sayı "+enKucuk);
        System.out.println("ortalama"+ortalama);

    }
}
