import java.sql.*;
public class Create {
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://Localhost:5432/studentmarks";
        String user="postgres";
        String pass="1234";
         String sql="insert into marks values(4,'jhon',99)";
         Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,user,pass );
        Statement st=con.createStatement();
        Boolean res=st.execute(sql);
        System.out.println(res);
        con.close();
        


    }
    
}
