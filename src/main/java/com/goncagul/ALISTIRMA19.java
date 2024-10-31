package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA19 {
    public static void main(String[] args) {
        //Kullanıcıdanbir dizi alın ve dizide tekrar eden elemanları bulun.
        int[]  sayilar3=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=sayilar3.length;i++)
        {
            System.out.println(i+"nci elemanı giriniz");
            sayilar3[i]=sc.nextInt();
            if(sayilar3[i]==sayilar3[i])
            {
                System.out.println("Tekrar eden sayı" + i);
            }
        }
    }
}
