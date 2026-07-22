import java.sql.*;  
import java.util.Scanner;  // Import the Scanner class

public class insertIntoDB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        try{  
            // while (true) {
            //     System.out.println("1:Select * from student");
            //     System.out.println("2:Insert into student");
            // }



            Class.forName("oracle.jdbc.driver.OracleDriver");        
            Connection con=DriverManager.getConnection(  
                "jdbc:oracle:thin:@localhost:1521:xe","system","123"
            );  
            Statement stmt=con.createStatement();

            System.out.println("Enter ROll");
            int i=sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Enter Name");
            String name=sc.nextLine();

            ResultSet rs=stmt.executeQuery("Insert into student values("+i+",'"+name+"')");  
            ResultSet pr=stmt.executeQuery("Select * from student");  
            while(pr.next()){
                System.out.println(pr.getInt(1)+"  "+pr.getString(2));  
            }  
            // System.out.println("Done");
            con.close();  
        }
        
        catch(Exception e){
            System.out.println(e);
        }    
    }  
}       