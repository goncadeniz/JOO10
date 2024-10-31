package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA12 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın.
        int i,fact=1;
        Scanner sc=new Scanner(System.in);
        int sayi=sc.nextInt();

        for(i=1;i<=sayi;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+sayi+" is: "+fact);

    }
}
