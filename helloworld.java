import java.util.*;

public class helloworld {
    public static void main(String args[]){
        System.out.println("Enter Number to find even odd");
        Scanner sc=new Scanner(System.in);
        int no=Integer.parseInt(sc.nextLine());
        if(no%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
