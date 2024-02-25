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
public class ArrayDuaDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner  input = new Scanner(System.in);
            int A[][]= new int[2][2];
            int B[][]= new int[2][2];
            int C[][]= new int[2][2];
            
            System.out.println("Masukkan Nilai Matriks A");
            for (int i=0;i<2;i++){
                for (int j=0;j<2;j++){
                    System.out.print("["+(i+1)+"]["+(j+1)+"]:");
                    A[i][j]=input.nextInt();
                }
            }
            
            System.out.println("\n Masukkan Nilai Matriks B");
            for(int k=0;k<2;k++){
                for(int l=0;l<2;l++){
                    System.out.print("["+(k+1)+"]["+(l+1)+"]:");
                    B[k][l]=input.nextInt();
                }
            }
            
            System.out.println("\n Matriks A");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(A[i][j]+ " ");
                }
                System.out.println("");
            }
            
            System.out.println("Matriks B");
            for(int k=0; k<2;k++){
                for(int l=0; l<2;l++){
                    System.out.print(B[k][l]+" ");
                }
                System.out.println("");
            }
            
            C[0][0]=A[0][0]*B[0][0]+A[0][1]*B[1][0];
            C[0][1]=A[0][0]*B[0][1]+A[0][1]*B[1][1];
            C[1][0]=A[1][0]*B[0][0]+A[1][1]*B[1][0];
            C[1][1]=A[1][0]*B[0][1]+A[1][1]*B[1][1];
            
            System.out.println("\n Hasil perkalian Matriks A dan B");
            System.out.println("====================================");
            for(int x=0;x<2;x++){
                for(int y=0;y<2;y++){
                    System.out.print(C[x][y]+" ");
                }
                System.out.println(" ");
            }
        }
        
    }
        

