/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;
import java.util.Scanner;
/**
 *
 * @author windows
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int belanjaan, diskon, bayar;
        String kartu;
       
       
        // mengambil input
        System.out.println("Apakah Ada Kartu Member:");
        kartu= input.next();
        System.out.println("Total Belanjaan:");
        belanjaan= input.nextInt();
       
       
        // Proses
        if (kartu.equalsIgnoreCase("Ya")){
            if (belanjaan > 500000){
                diskon=50000;
            }else if (belanjaan > 100000){
                diskon = 15000;
            }else{
                diskon=0;
            }
        }else{
            if (belanjaan > 100000){
                diskon= 5000;
            }else{
                diskon= 0;
            }
           
        // Total yang harus dibayar
        } bayar= belanjaan-diskon;
       
        //Output
        System.out.println("Total Bayar: Rp" + bayar);
       
    }
   
}

    
    
