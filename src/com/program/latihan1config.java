/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author windows
 */
public class latihan1config {
    private static Connection MYSQLConfig;
    
    public static Connection configDB() throws SQLException{
        try{
            String url="jdbc.mysql://localhost:3306/latihanjava";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url,user,pass);
            
            
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal" + e.getMessage());
        }
        return MYSQLConfig;
    }
    
}
