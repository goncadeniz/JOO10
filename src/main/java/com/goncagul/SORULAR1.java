package com.goncagul;

import java.util.Scanner;

public class SORULAR1 {
    public static void main(String[] args) {
        int sure = 0;
        do {
            System.out.println("""
                    
                    Bir kişinin öğrencilik süresini alıp hangi okul döneminde olduğunu söyleyen kodu yazınız.
                    
                    <5. “Elemantary School”
                    
                    5<= gradle <8 ”Junior School”
                    
                    8<= gradle <10 “High School”
                    
                    >=10 “College”
                    
                    <0 “NONE”
                    
                    """);
            Scanner sc = new Scanner(System.in);
            System.out.println("Öğrencilik sürenizi giriniz");
            sure = sc.nextInt();
            if (sure < 5) {
                System.out.println("Öğrenci  ELEMANTARY SCHOOL");
            } else if (sure >= 5 || sure < 8) {
                System.out.println("Öğrenci  JUNİOR SCHOOL");

            } else if (sure >= 8 || sure < 10) {
                System.out.println("Öğrenci  HİGH SCHOOL");

            } else if (sure >= 10) {
                System.out.println("Öğrenci  COLLEGE");

            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz ");
            }

        } while (sure != 0);


    }
}
