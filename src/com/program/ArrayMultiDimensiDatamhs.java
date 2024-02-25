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
public class ArrayMultiDimensiDatamhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner input= new Scanner (System.in);
      String Mahasiswa [][]= new String [2][4];
      
      for (int bar=0; bar< Mahasiswa.length; bar ++){
          for (int kol=0; kol< Mahasiswa [bar].length; kol ++){
              if (kol==0){
                  System.out.println("Nama:");
                  Mahasiswa [bar][kol]= input.nextLine();
              }
              else if (kol == 1){
                 System.out.println("Jurusan:");
                  Mahasiswa [bar][kol]= input.nextLine(); 
              }
              else if (kol == 2){
               System.out.println("Sekolah Asal:");
                Mahasiswa [bar][kol]= input.nextLine(); 
          }
              else if (kol == 3){
                 System.out.println("Domisili:");
                  Mahasiswa [bar][kol]= input.nextLine(); 
                  System.out.println("*************************");
              
              }  
      }
        
    }  
      
        System.out.println("");
        System.out.println("============================");
        System.out.println("Data Mahasiswa Yang Diinput:");
        for (int i= 0; i < Mahasiswa.length; i++){
            
            System.out.println("============================");
            System.out.println("Nama:" + Mahasiswa [i][0]);
            System.out.println("Jurusan:" + Mahasiswa [i][1]);
            System.out.println("Sekolah Asal:" + Mahasiswa [i][2]);
            System.out.println("Domisili:" + Mahasiswa [i][3]);
            
        }
      
        System.out.println("================================");   
      
}
}

    
    

