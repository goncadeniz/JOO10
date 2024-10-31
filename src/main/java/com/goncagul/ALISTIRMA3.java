package com.goncagul;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ALISTIRMA3 {
    public static void main(String[] args) {
        //Problem: Kullanıcıdan yarıçapı alınan bir dairenin alanını ve çevresini hesaplayan
        // bir program yazın (alan = π * r^2, çevre = 2 * π * r).

        Scanner sc = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz:");
        double yarıCap = sc.nextDouble();

        double pi = Math.PI;
        double cevre = 2 * pi * yarıCap;
        double alan = pi * yarıCap * yarıCap;

        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin alanı: " + alan);
    }
}
