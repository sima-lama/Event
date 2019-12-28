/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event.Management.System;
import java.sql.*;
public class EventManagementSystem {
    public static void main(String[] args) {
        Connection connection=DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/EventManagementSystem","Event","");
        Statement statement=connection.createStatement();
        Resultset resultset=statement.executeQuery("select * from categories");
        System.out.println("categories_id\t name");
        while (resutset.next()){
            System.out.println(resultset.getstring(3)+"\t\tRs"
                    +resultSet.getString(4)+"\t\t"+resultset.getstring(6);
            +resultSet.getString(7));)
                   connection.close();
        // TODO code application logic here
    }
    
}
