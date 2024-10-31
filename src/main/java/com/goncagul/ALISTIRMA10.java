package com.goncagul;

import java.util.Scanner;

public class ALISTIRMA10 {
    public static void main(String[] args) {
        //Kullanıcıdan bir ay ismi alın ve o ayın kaç gün
        // çektiğini ekrana yazdıran bir program yazın (şubat için 28 varsayılabilir).

             int ay=-1;
             do
             {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("lütfen hangi  ayda olduğumuzu (1-12) arasındaki sayı değeri ile belirtin ");
                  ay=sc.nextInt();
                 switch (ay) {
                     case 1:
                         System.out.println("Ocak ayı 31 gün çeker");
                         break;
                     case 2:
                         System.out.println("Şubat ayı 28 gün çeker");
                         break;
                     case 3:
                         System.out.println("Mart ayı 31 gün çeker");
                         break;
                     case 4:
                         System.out.println("Nisan ayı 30 gün çeker");
                         break;
                     case 5:
                         System.out.println("Mayıs ayı 31 gün çeker");
                         break;
                     case 6:
                         System.out.println("Haziran ayı 30 gün çeker");
                         break;
                     case 7:
                         System.out.println("Temmuz ayı 31 gün çeker");
                         break;
                     case 8:
                         System.out.println("Ağustos ayı 31 gün çeker");
                         break;
                     case 9:
                         System.out.println("Eylül ayı 30 gün çeker");
                         break;
                     case 10:
                         System.out.println("Ekim  ayı 31 gün çeker");
                         break;
                     case 11:
                         System.out.println("Kasım ayı 30 gün çeker");
                         break;
                     case 12:
                         System.out.println("Aralık ayı 31 gün çeker");
                         break;
                 }

             }while(ay!=-1);


    }
}
