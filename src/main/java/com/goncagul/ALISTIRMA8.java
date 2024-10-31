package com.goncagul;

import java.time.LocalDate;
import java.util.Scanner;

public class ALISTIRMA8 {
    public static void main(String[] args) {
        //Kullanıcıdan doğum yılını alın ve 18 yaşından büyük olup olmadığını
        // kontrol edin. Büyükse "Reşit", değilse "Reşit değil" yazdırın.

        System.out.println("Lütfen doğum yılınızı giriniz:");
        Scanner sc = new Scanner(System.in);
        int dogumYili = sc.nextInt();

        int mevcutYil = LocalDate.now().getYear(); // Mevcut yılı dinamik olarak alıyoruz
        int yas = mevcutYil - dogumYili;

        if (yas >= 18) {
            System.out.println("Reşit");
        } else {
            System.out.println("Reşit değil");
        }

    }
}
