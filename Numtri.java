import java.io.*;
import java.util.*;

class Numtri{
	public static void main(String args[])
	{
     int i,j,k;
     //BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); 
     System.out.println("Enter the no.of rows:");
     //int n=Integer.parseInt(rd.readLine());
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     for(i=1;i<=n;i++)
     {
       for(k=1;k<=n-i;k++){ System.out.print("  "); }
       for(j=1;j<=i;j++){ System.out.print(j+" "); }
       for(j=i-1;j>=1;j--){ System.out.print(j+" "); }
       System.out.println("");
     }

	}
}