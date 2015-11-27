import java.io.*;
import java.util.*;

class Fibanocci{
	public static void main(String args[])
	{
	  int f1=0,f2=1,f3,n,i=1;
	  Scanner in = new Scanner(System.in);
      System.out.println("Limit:");
      n=in.nextInt();
      System.out.print("Fibanocci Series\n"+f1+" "+f2);
      for(i=3;i<=n;i++)
      {
        f3=f1+f2;
        System.out.print(" "+f3);
        f1=f2;
        f2=f3;
      }
      System.out.println("");
	}
}