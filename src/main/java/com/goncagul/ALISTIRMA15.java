package com.goncagul;

public class ALISTIRMA15 {
    public static void main(String[] args) {
      //  * Problem: 1’den 100’e kadar olan sayılar içinde 3 ve 5 ile bölünebilen sayıları ekrana yazdırın.

        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i  +" sayısı 3 ve 5 e bölünür ");
            }
        }
    }
}
