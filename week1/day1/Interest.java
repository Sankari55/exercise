import java.io.*;
import java.util.*;

class Interest{
	public static void main(String args[])
	{
     double s,c,p,n,r,t;
     Scanner in = new Scanner(System.in);
     System.out.println("Principal amount:");
     p=in.nextDouble();
     System.out.println("No.of years:");
     n=in.nextDouble();
     System.out.println("Rate of interest:");
     r=in.nextDouble();
     System.out.println("Time of compounding:");
     t=in.nextDouble();
     System.out.println("Simple Interest:"+p*n*r/100);
     r=r/100;
     c=Math.pow((1+r/t),(n*t));
     c=p*c;
     System.out.println("Compound Interest:"+c);

	}
}