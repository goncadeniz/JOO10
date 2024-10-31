package com.goncagul;

import java.util.Scanner;

public class SORULAR2 {
    public static void main(String[] args) {

              int cikis=0;
              do {

                  System.out.println("""
                Bir yolculuk için toplam maliyeti hesaplayan kodu yazınız. Kurallar;
                
                - L: LPG için H: Hibrit için kullanılacaktır.
                
                - Arabanın yaşı ve yolculuğun KM si için 2 tam sayı değeri alın
                
                - Kullanıcı L veya H girmez ise hata verin
                
                - Toplam maliyet motor tipine göre hesaplanacaktır
                
                - LPG 100km de 3.3lt
                
                - HIBRIT 100km de 4.2lt
                
                - LPG yakıtı 1.6₺ 1 litre için
                
                -HIBRIT 2 yakıtı 1.6₺ 1 litre için
                
                - Aracın yaşı 7 den küçük ve eşit ise toplam maliyeti yazdırmanız yeterli
                
                - Arabanın yaşı 7 den fazla ve 12 ye eşit ve küçük ise maliyet %3 arttırılmalı
                
                - Arabanın yaşı 12 de n büyük ise toplam maliyet %7 arttırılmalıdır
                
               ÇIKMAK İÇİN 0 A BASINIZ 
                
            
                """);

                  int maliyet;
                  Scanner sc=new Scanner(System.in);
                  System.out.println(" LÜTFEN MOTOR TİPİNİ BELİRTİNİZ ....LPG  İÇİN  L   HİBRİT İÇİN H  TUŞUNA BASINIZ ");
                  Scanner scn=new Scanner(System.in);
                  String  motorTipi=scn.nextLine();
                  System.out.println("Lütfen arabanın yaşını giriniz");
                  int arabaYası=scn.nextInt();
                  System.out.println("Lütfen kaç kilometre yol gittiğinizi yazınız ");
                  int kilometre=scn.nextInt();
                  double  maliyetLpg=(kilometre * 33)*16;
                  double maliyetHibrit=(kilometre * 42)*16;

                  if(motorTipi.toUpperCase().equals("L") )
                  {
                      switch (arabaYası)
                      {
                          case 1:
                              if( arabaYası<=7)
                              {System.out.println("LPG Maliyeti "+ maliyetLpg);}
                              break;
                          case 2:
                              if( arabaYası>=7  &&  arabaYası<=12 )
                              {
                                  System.out.println("LPG Maliyeti "+(maliyetLpg*33)/100);
                              }
                              break;

                          case 3:
                              if(arabaYası>12)
                              {
                                  System.out.println("LPG Maliyeti "+ (maliyetLpg*7)/100);
                              }
                              break;
                      }
                  }
                  else if(motorTipi.toUpperCase().equals("H"))
                  {

                      switch (arabaYası)
                      {
                          case 1:
                              if( arabaYası<=7)
                              {System.out.println("Hibrit Maliyeti "+maliyetHibrit);}
                              break;
                          case 2:
                              if( arabaYası>=7  &&  arabaYası<=12 )
                              {
                                  System.out.println("Hibrit Maliyeti "+(maliyetHibrit+=((maliyetHibrit*33)/100)));
                              }
                              break;

                          case 3:
                              if(arabaYası>12)
                              {
                                  System.out.println("Hibrit Maliyeti "+(maliyetHibrit+=((maliyetHibrit*7)/100)));
                              }
                              break;
                      }
                  }
                  else
                  {
                      System.out.println("Motor tipini yanlış girdiniz .LPG  İÇİN  L   HİBRİT İÇİN H  TUŞUNA BASINIZ");

                  }


              }while(cikis!=0);


    }
}
