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
public class UjianSQAjc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double celcius;
        double fahrenheit;
        
        System.out.println("Masukan nilai Fahrenheit : ");
        fahrenheit = input.nextDouble();
       
        celcius = (5.0/9)*(fahrenheit-32.0);
        
        System.out.println(+fahrenheit+" F sama dengan "+celcius+" C");
    }
    
}
