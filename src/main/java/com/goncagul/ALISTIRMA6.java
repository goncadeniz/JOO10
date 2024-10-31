package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA6 {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı alın ve bu sayının çift mi, tek mi olduğunu belirleyin.


            int sayi=-1;
        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("Lütfen bir tam sayı giriniz");
             sayi=sc.nextInt();
            if(sayi%2==0)
            {
                System.out.println("Girdiğiniz  sayı çifttir");
            }
            else {
                System.out.println("Girdiğiniz sayı tektir ");
            }
        }while (sayi!=-1);
    }
}
