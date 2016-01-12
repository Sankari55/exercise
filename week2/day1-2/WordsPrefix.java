import java.util.*;
import java.lang.Math;

public class WordsPrefix{

	public static void main(String args[]){

		Scanner in=new Scanner(System.in);

		Map<String, ArrayList<String>> wmap = new TreeMap<String, ArrayList<String>>();
		
		System.out.println("Enter the no of words:");
		Integer n=in.nextInt();
		String[] words = new String[n];
		
		System.out.println("Enter the words:");
		for(int i=0;i<n;i++){
			words[i]=in.next();
		}

		for(String wrd:words){
			String prefix=wrd.substring(0,3);
			ArrayList<String> wlist=new ArrayList<String>();
			if(wmap.containsKey(prefix)){
				wlist=wmap.get(prefix);
			}
			wlist.add(wrd);
			wmap.put(prefix,wlist);
		}

		for(String key:wmap.keySet()){
			ArrayList<String> wrds=wmap.get(key);
			Collections.sort(wrds);
			System.out.println(key+": "+wrds);
		}

		/*for(String str : words){
			String prefix = str.substring(0, Math.min(str.length(), 3));
			ArrayList<String> wordList=wordsMap.containsKey(prefix)?wordsMap.get(prefix):new ArrayList<String>();	
			wordList.add(str);
			wordsMap.put(prefix,wordList);
		}

		for(String key : wordsMap.keySet()){
			ArrayList<String> values = wordsMap.get(key);
			Collections.sort(values);
			System.out.println(key +  " - " + values);	
		}*/
		

	}
}