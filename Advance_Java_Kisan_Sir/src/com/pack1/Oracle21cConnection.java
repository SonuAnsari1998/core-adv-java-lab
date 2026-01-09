package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle21cConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "c##sonu";
        String password = "sonu";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Oracle 21c Connected Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

