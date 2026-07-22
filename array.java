import java.util.*;
class array{

    public static void main(String[] args) {
        System.out.println("Enter No");
        
        Scanner sc=new Scanner(System.in);
        
        int n=Integer.parseInt(sc.nextLine());
        
        int arr[];
        
        System.out.println("Enter "+n+" Values");
        
        arr=new int[n];
        
        for (int i=0; i<n;i++) {
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        
        for (int i=0; i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("");
        
        System.out.println("Enter Number to search");
        
        int no=Integer.parseInt(sc.nextLine());
        int j;

        for(j=0;j<n;j++){
            if (arr[j]==no) {
                System.out.println("Found at "+j+" Index");
                break;
            }
        }

        if(j==n && arr[j]!=no){
            System.out.println("Not found");
        }
    }
}
