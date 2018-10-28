import java.util.Scanner;

public class swastic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter odd number to get your swastic pattern");
		 System.out.println();
         int n=s.nextInt();
       
        int half=(n-1)/2;
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
             {
                 //first line
                 if(i==0 && j>=half || (i==0 && j==0))
                 {
                     
                     System.out.print(" *");
                 }
                 else if(i>0 && i<half)
                 {
                     if(j==0 || j==half)
                     {
                         System.out.print(" *");
                     }
                     else
                     {
                         System.out.print("  ");
                     }
                 }
                 else if(i==half)
                 {
                     System.out.print(" *");
                 }
                 
                else if(i>half && i<n-1)
                 {
                     if(j==half || j==n-1)
                     {
                         System.out.print(" *");
                     }
                      else                     {
                         System.out.print("  ");
                     }
                 }
                 else if(i==n-1)
                 {
                     if(j<=half || j==n-1)
                     {
                         System.out.print(" *");
                     }
                      else
                     {
                         System.out.print("  ");
                     }
                 }
                 else System.out.print("  ");
             }
             System.out.println();
            
        }
	}

}
