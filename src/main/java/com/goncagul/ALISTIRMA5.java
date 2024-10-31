package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA5 {
    public static void main(String[] args) {
        //Kullanıcıdan bir ürünün fiyatını alın ve %18 KDV eklenmiş halini ekrana yazdıran bir program yazın.

        Scanner sc=new Scanner(System.in);
        System.out.println("ürünün fiyatını giriniz ");
        int fiyat=sc.nextInt();
        int kdvliFiyat= (fiyat*18)/100;
        System.out.println("Ürünün kdvli fiyatı....: "+kdvliFiyat);
    }
}
