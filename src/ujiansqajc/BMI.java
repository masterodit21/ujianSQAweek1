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
public class BMI {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        float berat, tinggi, bmi, meter;
        double broca;
     
        System.out.print ("Masukan weight: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println("............................................");
        System.out.print("BMI adalah: "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("(Kurus)");
        }else if (bmi<=24.9){
            System.out.println("(Normal)");
        }else if (bmi<29.9){
            System.out.println("(Overweight)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }
    }
    
}
