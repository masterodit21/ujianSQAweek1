/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujiansqajc;

import java.util.Scanner;

/**
 *
 * @author zentrum3
 */
public class jarak {
    public static void main(String[] args) {
        // TODO code application logic here
        double jarak,jam,menit,detik,waktu;
        double hmeter,hKilometer,hmil;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Masukan Jarak dalam Meter: ");
        jarak=input.nextDouble();
        System.out.println("Masukan Jam: ");
        jam=input.nextDouble();
        System.out.println("Masukan Menit: ");
        menit=input.nextDouble();
        System.out.println("Masukan Detik: ");
        detik=input.nextDouble();
        
        System.out.println("hasil konversi:");
        waktu= (3600*jam)+(60*menit)+detik ;
        hmeter= (double) jarak/waktu;
        System.out.println("Kecepatan dalam meter/second adalah "+hmeter);
        waktu = jam+(menit/60)+(detik/3600);
        hKilometer = (double)(jarak/1000)/waktu;
        System.out.println("Kecepatan dalam km/h "+hKilometer);
        waktu = jam+(menit/60)+(detik/3600);
        hmil = (double)(jarak/1609)/waktu;
        System.out.println("Kecepatan dalam mil/h "+hmil);
    }
    
}
