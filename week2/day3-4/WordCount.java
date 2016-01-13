import java.io.*;
import java.util.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordCount {
	public static void main(String args[]){	
		try{
			
			PrintWriter out=new PrintWriter(new FileWriter("count.txt"));
			FileInputStream fs=new FileInputStream("Words.txt");
		
			Map<String,Integer> wmap=new HashMap<String,Integer>();
			
			DataInputStream in=new DataInputStream(fs);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			
			String strLine=null;
			while((strLine=br.readLine())!=null){
				String[] wrds=strLine.split(" ");
				for(String ss:wrds){
					if(wmap.containsKey(ss)){
						int n=wmap.get(ss);
						n++;
						wmap.put(ss,n);
					} else {
						wmap.put(ss,1);
					}
				}
			}
			for(String key:wmap.keySet()){
				String text="["+key+"]:["+wmap.get(key)+"]\n";
				//System.out.print(text);
				out.write(text);
			}
			out.close();
			
		}catch(IOException e){
			System.out.println("Couldnt print");
		}
	}
}