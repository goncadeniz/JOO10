package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA18 {
    public static void main(String[] args) {
        //Bir dizi oluşturun ve dizideki elemanları küçükten büyüğe sıralayan bir program yazın.

        Scanner scan = new Scanner(System.in);
        int gecici;
        int [] dizi = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
        for(int i = 0; i < 9; i++)
        {
            for(int j = i+1; j < 10; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
        }
    }

}
