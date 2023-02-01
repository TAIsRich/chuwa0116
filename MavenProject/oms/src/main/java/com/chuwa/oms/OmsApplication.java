package com.chuwa.oms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.sql.*;

@SpringBootApplication
public class OmsApplication {
    private static String username = "springstudent";
    private static String password = "springstudent";

    private static String driver= "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {
        System.out.println(username);
        try{
            Class.forName(driver);
            Connection con=DriverManager.getConnection(
                    url,username, password);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from oms_company_address");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            }
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
