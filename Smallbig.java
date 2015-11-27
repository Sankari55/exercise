import java.io.*;
import java.util.*;

class Smallbig{
	public static void main(String args[])
	{
	  int[] aa=new int[15];
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter 10 array values:");
      for(int i=0;i<10;i++)
        aa[i]=in.nextInt();
      maxmin(aa);


	}
	public static void maxmin(int[] numbers)
	{
	   int largest=0, smallest=0;
	   for(int number : numbers)
	   {
	     if(number>largest)
	        largest=number;
	      else
	        if(number<smallest)
	           smallest=number;

	   }
	

	System.out.println("Largest number:"+largest);
	System.out.println("Smallest number:"+smallest);
}
}