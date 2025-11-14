package com;

import java.sql.*;
public class Update {
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://Localhost:5432/studentmarks";
        String user="postgres";
        String pass="1234";
         String sql="update marks set name='johnny' where sid=4";
         //just like update statement we can use the delete statement too
         Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,user,pass );
        Statement st=con.createStatement();
        st.execute(sql);
        con.close();
        


    }
    
}
