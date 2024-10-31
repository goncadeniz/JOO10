package com.goncagul;

public class ALISTIRMA17 {
    public static void main(String[] args) {
        //Problem: Bir dizideki en küçük elemanı ve indeksini bulan bir program yazın.

        int[]  sayilar={2,8,6,4,23,87,65};
        int enKucuk=sayilar[0];
        for(int i=0;i<=sayilar.length;i++)
        {
            if(sayilar[i]<enKucuk)
            {
                enKucuk=sayilar[i];
                System.out.println("en küçük sayılı dizi elemanı indeksi"+i);
            }
        }
    }
}
