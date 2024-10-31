package com.goncagul;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ALISTIRMA4 {
    public static void main(String[] args) {

        //* Problem: Kullanıcıdan bir cümle alın ve cümlenin karakter sayısını ekrana yazdıran bir program yazın.
        System.out.println("Lütfen ekrana bir cümle yazınız ");
        Scanner sc=new Scanner(System.in);
        String cumle=sc.nextLine();
        int karakterSayısı=cumle.replace(" ","").length();
        System.out.println("cümledeki karakter sayısı" +karakterSayısı);

    }
}
