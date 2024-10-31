package com.goncagul;

import java.util.Scanner;

public class SORULAR5 {
    public static void main(String[] args) {
        System.out.println("""
                
                5- Elimizde şöyle bir liste var, bu listeden şehir seçildiğinde ilgili şehirin plaka
                 numarasını veren kodu yazınız.
                
                01- Adana
                
                02- Adıyaman
                
                03- Ayfon
                
                10- Balıkesir
                
                11- Bilecik
                
                12- Bingöl
                
                13- Bitlis
                
                20- Denizli
                
                Yukarıda verilen plaka kodlarını kullanacaksınız.
                
                Örn:
                
                Şehir adını giriniz: ADANA
                
                Plaka: 01
                
                Örn:
                
                Şehir adını giriniz: BiTLis
                
                Plaka: 13
                
                0: çıkış
                
                
                """);
        int secim=0;
        do{
            String[] sehirler={"ADANA","ADIYAMAN","AFYON","BALIKESİR" ,"BİLECİK" ,"BİNGOL","BİTLİS" ,"DENİZLİ"};
            String[] plakaKodu={"01","02","03","10","11","12","13","20","32"};
            Scanner sc=new Scanner(System.in);
            System.out.println("Lütfen şehrin adını giriniz ");
            String ad=sc.nextLine();
            for(int i=1;i<=9;i++)
            {
                sehirler[i]=plakaKodu[i];
              if(sehirler[i]== ad.toUpperCase())
              {
                  System.out.println("Plaka :" +plakaKodu[i]);
              }
            }

        }while(secim!=0);
    }
}
