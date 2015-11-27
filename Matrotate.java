import java.io.*;
import java.util.*;

class Matrotate{
	public static void main(String args[])
	{
	 int i,j,n=4;
	 int[][] aa = {{1,2,3},{4,5,6},{7,8,9}};
	 Scanner in = new Scanner(System.in);
	 for(i=0;i<n;i++)
	 {   
	 	for(j=0;j<n;j++) System.out.print(aa[j][i]);
	    System.out.println("");
	 }
	 System.out.println("Right/Left?(l/r):");
	 String ch = in.nextLine();
     System.out.println("Choice is:"+ch);
     if(ch.equals("r"))
       for(i=0;i<n;i++)
	   {
	 	for(j=n-1;j>=0;j--) System.out.print(aa[j][i]);
	 	System.out.println("");
	   }
	 else
	   for(i=n-1;i>=0;i--)
	   {
	 	for(j=0;j<n;j++)
	 		System.out.print(aa[j][i]);
	 	System.out.println("");
	   }
	

	}
}