package com;
import java.sql.*;
public class Pstatement {
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://Localhost:5432/studentmarks";
        String user="postgres";
        String pass="1234";
        int a=5;
        String n="Justin";
        int m=100;
        String sql="insert into marks values(?,?,?)";
         //just like update statement we can use the delete statement too
         
         Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,user,pass );
       PreparedStatement ps=con.prepareStatement(sql);
       ps.setInt(1,a);
       ps.setString(2,n);
       ps.setInt(3,m);
       ps.execute();
        con.close();
        


    }
    
}

