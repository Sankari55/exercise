import java.io.*;
import java.util.*;

class Abc{
	public static void main(String args[])
	{
	 Scanner in = new Scanner(System.in);
	 String abc;
	 char z;
	 int s,sum=0,i;
	 System.out.println("Enter the string:");
	 abc=in.nextLine();
	 for(i=0;i<abc.length();i++)
	 {
        if(i==0) System.out.print("(");
	z=abc.charAt(i);
        s=(int)z;
        System.out.print(s-96);
	sum+=s-96;
	if(i==abc.length()-1) System.out.print("="+sum+")");
	else if(i!=abc.length()) System.out.print("+");
	 }
	 if(sum%2!=0) System.out.println("odd");
	 else System.out.println("even");
	}
}
