import java.io.*;
import java.util.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SearchWord {
	public static void main(String args[]){	
		try{
			
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the word to be searched:");
			String text=scn.next();
			String outFile=text+".txt";
			PrintWriter out=new PrintWriter(new FileWriter(outFile));
			FileInputStream fs=new FileInputStream("Content.txt");
		
			Map<String,Integer> wmap=new HashMap<String,Integer>();
			
			String txt=new String();
			DataInputStream in=new DataInputStream(fs);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			
			String strLine=null;
			int lines=0;
			while((strLine=br.readLine())!=null){
				lines++;
				//System.out.println("hello");
				if(strLine.contains(text)){
					String[] wrds=strLine.split(" ");
					System.out.print(lines+":");
					txt=lines+":";
					for(int i=-1;(i=strLine.indexOf(text,i+1))!=-1;){
						System.out.print(i+",");
						txt+=i+",";
					}
				}
				System.out.println();
				out.write(txt+"\n");
				//out.newLine();
			}	
			/*for(String key:wmap.keySet()){
				String text="["+key+"]:["+wmap.get(key)+"]\n";
				//System.out.print(text);
				out.write(text);
			}*/
			out.close();
			
		}catch(IOException e){
			System.out.println("Couldnt print");
		}
	}
}
