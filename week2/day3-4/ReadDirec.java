import java.io.File;
import java.util.*;

public class ReadDirec {

   
   public static void main(String[] args) {
      ArrayList<String> extension=new ArrayList<String>();
      ReadDirec d=new ReadDirec();
            
      try{      
         // create new file object
         File directory[] = new File("/Users/cb-sankari/desktop").listFiles(File::isDirectory);
         File files[] = new File("/Users/cb-sankari/desktop").listFiles(File::isFile);

         for(File fil:files){
            //System.out.println("File: "+fil.getName());
            d.checkFil(fil,extension);
         }

         for(File dir:directory){
            //System.out.println("Directory: "+dir.getName());
            d.checkDir(dir,extension);
         }
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
      System.out.println("DONE!!!");
      d.displayExtension(extension);
   }

   public void checkFil(File fil,ArrayList extension){
      int i=fil.getName().lastIndexOf('.');
      if(i>0){
         String ext=fil.getName().substring(i+1);
         //System.out.println("extension: "+ext);
         extension.add(ext);
      }
   }

   public void checkDir(File direc,ArrayList extension){
      try{
         String dd=direc.getPath();
         //System.out.println(dd);
         File directory[] = new File(dd).listFiles(File::isDirectory);
         File files[] = new File(dd).listFiles(File::isFile);

         for(File fil:files){
            //System.out.println("File: "+fil.getName());
            checkFil(fil,extension);
         }

         for(File dir:directory){
            //System.out.println("Directory: "+dir.getName());
            checkDir(dir,extension);
         }
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
   }

   public void displayExtension(ArrayList<String> extension){
      ArrayList<String> ee=new ArrayList<String>();
      //ee.add("");

      for(String ss:extension){
         if(ee.contains(ss)){
            continue;
         }
         else{
            ee.add(ss);
         }
      }
      for(String ss:ee){
         int n=Collections.frequency(extension,ss);
         System.out.println("No.of "+ss+" files: "+n);
      }
   }

}
