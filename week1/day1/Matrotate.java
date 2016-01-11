import java.io.*;
import java.util.*;

class Matrotate  {
	public static void main(String args[])
	{
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter size of matrix:");
	 int n=in.nextInt();
	 int[][] aa=new int[n][n];
	 for(int i=0;i<n;i++)
	 {   
	 	for(int j=0;j<n;j++) {
	 		aa[i][j]=in.nextInt();
	 	}
	 }
	 System.out.println("Right/Left?(l/r):");
	 String ch = in.next();
     System.out.println("Choice is:"+ch);
     if(ch.equals("r")){
       for(int i=0;i<n;i++)
	   {
	 	for(int j=n-1;j>=0;j--) System.out.print(aa[j][i]);
	 	System.out.println("");
	   }
	  }
	 else{
	   for(int i=n-1;i>=0;i--)
	   {
	 	for(int j=0;j<n;j++)
	 		System.out.print(aa[j][i]);
	 	System.out.println("");
	   }}
	}
}
