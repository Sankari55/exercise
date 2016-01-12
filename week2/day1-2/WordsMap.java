import java.io.*;
import java.util.*;

public class WordsMap{

	public static void main(String args[]){

		Scanner in=new Scanner(System.in);

		Map<Integer,ArrayList<String>> wmap=new HashMap<Integer,ArrayList<String>>();
		
		System.out.println("Enter the no of words:");
		Integer n=in.nextInt();
		String[] words = new String[n];
		
		System.out.println("Enter the words:");
		for(int i=0;i<n;i++){
			words[i]=in.next();
		}

		for(String wrd:words){
			Integer len=wrd.length();
			ArrayList<String> wlist=new ArrayList<String>();
			if(wmap.containsKey(len)){
				wlist=wmap.get(len);
			}
			wlist.add(wrd);
			wmap.put(len,wlist);
		}

		System.out.println(wmap);
	}
}