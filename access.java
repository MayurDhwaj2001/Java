import java.sql.*;  
public class access {
    public static void main(String args[]){
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");        
            Connection con=DriverManager.getConnection(  
                "jdbc:oracle:thin:@localhost:1521:xe","system","123"
            );  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from student");  
            while(rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
            }  
            con.close();  
        }
        
        catch(Exception e){
            System.out.println(e);
        }    
    }  
}       