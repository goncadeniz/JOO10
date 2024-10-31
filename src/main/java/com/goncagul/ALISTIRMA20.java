package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA20 {
    public static void main(String[] args) {
        //10 elemanlı bir dizide yalnızca çift sayıları ekrana yazdıran bir program yazın.

        int[]  sayilar4=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=sayilar4.length;i++)
        {
            if(sayilar4[i]%2==0)
            {
                System.out.println(i+ "sayısı çift bir sayıdır ");
            }
        }
    }
}
