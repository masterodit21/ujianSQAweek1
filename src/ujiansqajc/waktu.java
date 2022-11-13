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
public class waktu {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        
        int menit, hari, bulan, tahun;
        
        System.out.print("Berapa menit yang ingin anda konversikan : ");
        menit = input.nextInt();
        
        tahun =(menit/525600);
        bulan =(menit/43800);
        hari = (menit/1440);
        
        
        
        System.out.println("Dalam tahun : "+tahun+" Tahun ");
        System.out.println("Dalam bulan : "+bulan+" bulan ");
        System.out.println("Dalam hari : "+hari+" hari ");
    }
    
}
