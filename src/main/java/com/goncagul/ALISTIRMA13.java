package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA13 {
    public static void main(String[] args) {
        //Problem: Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ");
        int sayi=sc.nextInt();

        for(int i=1;i<=sayi;i++)
        {
            boolean bolunuyorMu=false;
            for(int j=2;j<=i/2;j++)
            {

                if(i%j==0) break;
                else
                {
                    bolunuyorMu=true;
                   break;
                }
            }
            if(!bolunuyorMu) System.out.println(i);
        }
    }
}
