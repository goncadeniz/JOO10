package com.goncagul;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SORULAR5 {
    public static void main(String[] args) {

        boolean secim = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    5- Elimizde şöyle bir liste var, bu listeden şehir seçildiğinde ilgili şehirin plaka
                     numarasını veren kodu yazınız.

                    01- Adana
                    02- Adıyaman
                    03- Afyon
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

            String[] sehirler = {"ADANA", "ADIYAMAN", "AFYON", "BALIKESİR", "BİLECİK", "BİNGÖL", "BİTLİS", "DENİZLİ"};
            String[] plakaKodu = {"01", "02", "03", "10", "11", "12", "13", "20"};

            System.out.println("Lütfen şehrin adını giriniz: ");
            String ad = sc.nextLine();

            if (ad.equals("0")) {
                secim = false;
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            boolean bulundu = false;
            for (int i = 0; i < sehirler.length; i++) {
                if (ad.toUpperCase().equals(sehirler[i])) {
                    System.out.println("Plaka: " + plakaKodu[i]);
                    bulundu = true;
                    break;
                }
            }

            if (!bulundu) {
                System.out.println("Girdiğiniz şehir listede bulunmamaktadır.");
            }

        } while (secim);


    }
}
