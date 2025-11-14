    package com.marks;

    import java.sql.*;
    public class App {
        public static void main(String[] args) throws Exception {
            /*
            1)import the package
            2)load and register the driver
            3)esablish the connection
            4)create the statement
            5)execute the query or update
            6)process the results   
            7)close the connection
            */

            String url="jdbc:postgresql://Localhost:5432/studentmarks";
            String user="postgres";
            String password="1234";
            String sql="Select name from marks where sid=1";

        Class.forName("org.postgresql.Driver");
        
        Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("connection established");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
        rs.next();
            String res=rs.getString("name");
            
        System.out.println("name is :"+res);
                con.close();
            System.out.println("connection closed");
            


            
        }



        
        
    }
