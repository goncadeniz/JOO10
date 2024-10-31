package com.goncagul;

import java.util.Scanner;

public class SORULAR3 {
    public static void main(String[] args) {

        int sayı=0;
        do{

            System.out.println("""
                Kübik number ları yazdıracaksınız ancak ekranda çıktılandığı şekilde olması istenmektedir
                
                Örn:

                Bir sayı giriniz…: 5
                
                Sayı 1:125
                
                Sayi 2:64
                
                Sayi 3:27
                
                Sayi 4:8
                
                Sayi 5:1
                
         
                """);


            System.out.println("bir sayı giriniz ");
            Scanner sc=new Scanner(System.in);
            int sayi=sc.nextInt();
            for (int i=1;i<=sayi;i++)
            {
                System.out.println("Sayı"+"i: "+ (i*i*i));
            }

        }while(sayı!=0);




    }


}
