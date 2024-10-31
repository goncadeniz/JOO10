package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA2 {
    public static void main(String[] args) {
        //Bir öğrencinin sınav notlarını (vize ve final) kullanıcıdan alın,
        // vize %40, final %60 etkili olacak şekilde ortalamayı hesaplayın.

        Scanner sc=new Scanner(System.in);
        System.out.println("Vize notunuzu girin ");
        int vize=sc.nextInt();
        System.out.println("Final notunuzu girin ");
        int finalNotu = sc.nextInt();
        int ortalama= ((vize * 40)+(finalNotu * 60))/100;
        System.out.println("ortalamanız"+ortalama);

    }
}
