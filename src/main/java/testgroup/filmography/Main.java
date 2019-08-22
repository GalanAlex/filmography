package testgroup.filmography;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306?serverTimezone=Europe/Samara&useSSL=false";
        String username = "root";
        String password = "AlEx1488";
        System.out.println("Connecting...");

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            System.out.println("Ok");
        }catch (SQLException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
