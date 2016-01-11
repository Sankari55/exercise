import java.io.*;
import java.util.*;

class Abc  {
	public static void main(String args[])
	{
	 Scanner in = new Scanner(System.in);
	 String abc,sentence="";
	 char z;
	 int s,sum=0;
	 System.out.println("Enter the string:");
	 abc=in.nextLine();
	 for(int i=0;i<abc.length();i++){
	 	if(Character.isUpperCase(abc.charAt(i))==true){
	 		char ch2=(char)(abc.charAt(i)+32);
	 		sentence=sentence+ch2;
	 	}
	 	else if(Character.isLowerCase(abc.charAt(i))==true){
	 		char ch2=(char)(abc.charAt(i));
	 		sentence=sentence+ch2;
	 	}
	 	else{
	 		System.out.println("Enter valid input.");
	 		return;
	 	}
	 }
	 for(int i=0;i<sentence.length();i++)
	 {
        if(i==0){ System.out.print("(");  }
	    z=sentence.charAt(i);
        s=(int)z;
        System.out.print(s-96);
	    sum+=s-96;
	    if(i==sentence.length()-1) { System.out.print("="+sum+")"); }
	    else if(i!=sentence.length()){ System.out.print("+"); }
	 }
	 if(sum%2!=0) System.out.println("odd");
	 else System.out.println("even");
	}
}
