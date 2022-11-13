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
public class panjang {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float inci,meter;

System.out.println("masukkan inci : ");
inci = input.nextFloat();
meter = inci * 254/10000;

System.out.println(inci + " inci adalah " +meter+ " meter");
    
}
}
