import java.sql.*;
public class Smarks {
    public static void main(String[] args) {
        /*
        1)import the package
        2)load and register the driver
        3)esablish the connection
        4)create the statement
        5)execute the query or update
        6)process the results   
        7)close the connection
         */

        String url="jdbc:postgresql://Localhost:5432/studentmarks"
        String user="postgres";
        String password="1234";
        String sql="Select name from marks where sid=1"
        class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("connection established");
        Statement st=con.createstatement();
        ResultSet rs=st.executeQuery(sql);
        System.out.println(rs.next());

        con.close();
        System.out.println(connection closed);
        


        
    }
    
}
