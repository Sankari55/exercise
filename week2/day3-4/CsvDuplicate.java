import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;


/*class Person implements Comparable<Person>{
    private String name;
    private String address;
    private long mobile;
    private long work;
    private long home;

    public Person(String name,String address,long mobile,long work,long home){
        this.name=name;
        this.address=address;
        this.mobile=mobile;
        this.work=work;
        this.home=home;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public long getMobile(){
        return mobile;
    }

    public long getWork(){
        return work;
    }

    public long getHome(){
        return home;
    }

    //@Override
    public int compareTo(Person per){
        return name.compareTo(per.getName());
    }

    @Override
    public String toString(){
        return "Person [name="+name+", address="+address+", mobile="+mobile+", work="+work+", home="+home+"]";
    }
}*/
 
class CsvFileReader {
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";

    private static final int NAME_IDX = 0;
    private static final int ADDRESS_IDX = 1;
    private static final int MOBILE_IDX = 2;
    private static final int WORK_IDX = 3;
    private static final int HOME_IDX = 4;

    public static void readCsvFile(String fileName,ArrayList<String> lines) {

    BufferedReader fileReader = null;
    try {
            String line="";
            fileReader = new BufferedReader(new FileReader(fileName));
            //fileReader.readLine();
             
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                for(String token:tokens){
                    if (lines.contains(token)) {
                        continue;
                    } else {
                        lines.add(token);
                    }
                }
            /*Collections.sort(persons);
            //Print the new student list
            for (Person pp : persons) {
                System.out.println(pp.toString());
            }*/
            System.out.println(lines);
            }
        }catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
    }
}


class CsvFileWriter {

    private static final String COMMA_DELIMITER = ",";
    //private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeCsvFile(String fileName,ArrayList<String> lines) {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);


            //Write the CSV file header
            //fileWriter.append(FILE_HEADER.toString());
            //Add a new line separator after the header
            //fileWriter.append(NEW_LINE_SEPARATOR);
            //Write a new student object list to the CSV file
            for (String line : lines) {
                fileWriter.append(line);
                fileWriter.append(COMMA_DELIMITER);
            }

            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}


public class CsvDuplicate {

    public static void main(String[] args) {
        String fileName1 ="Data.csv";
        String fileName2 ="Final.csv";

        ArrayList<String> lines = new ArrayList<String>();

        System.out.println("\nRead CSV file:");
        CsvFileReader.readCsvFile(fileName1,lines);
        System.out.println("Write CSV file:");
        CsvFileWriter.writeCsvFile(fileName2,lines);
    }
}

