package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA9 {
    public static void main(String[] args) {
        //Kullanıcıdan üç sayı alın ve en büyüğünü ekrana yazdırın.
        Scanner sc=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sy1=sc.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sy2=sc.nextInt();
        System.out.println("3.sayıyı giriniz");
        int sy3=sc.nextInt();

        int enBuyuk=sy1;
        if(sy1<sy2)
        {
            enBuyuk=sy2;
        }
      if(sy2<sy3)
      {
          enBuyuk=sy3;
      }
        System.out.println("En büyük sayı  "+ enBuyuk);

    }
}
