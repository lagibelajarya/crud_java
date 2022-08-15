/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfigurasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author rifaldi
 */
public class koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/db_pos";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            System.out.println();
        }
        return conn;
    }
    
    public static void main(String[] args){
        try {
            Connection c = koneksi.getConnection();
            System.out.println(String.format("Connected to database %s" + "Succesfully.",
            c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
