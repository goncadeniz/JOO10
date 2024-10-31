package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA8 {
    public static void main(String[] args) {
        //Kullanıcıdan doğum yılını alın ve 18 yaşından büyük olup olmadığını
        // kontrol edin. Büyükse "Reşit", değilse "Reşit değil" yazdırın.

        System.out.println("Lütfen doğum yılınızı giriniz");
        Scanner sc=new Scanner(System.in);
        int dogumYılı=sc.nextInt();
        int yas=2024-dogumYılı;
        if(yas>=18)
        {
            System.out.println("Reşit");
        }
        else
        {
            System.out.println("Reşit değil");
        }
    }
}
