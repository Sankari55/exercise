import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;


class Person implements Comparable<Person>{
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
}
 
class CsvFileReader {
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";

    private static final int NAME_IDX = 0;
    private static final int ADDRESS_IDX = 1;
    private static final int MOBILE_IDX = 2;
    private static final int WORK_IDX = 3;
    private static final int HOME_IDX = 4;

    public static void readCsvFile(String fileName) {

    BufferedReader fileReader = null;
    try {
            ArrayList<Person> persons = new ArrayList<Person>();
            String line = "";

            fileReader = new BufferedReader(new FileReader(fileName));
            fileReader.readLine();
             
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                    //Create a new student object and fill his  data
                   Person per = new Person(tokens[NAME_IDX], tokens[ADDRESS_IDX], Long.parseLong(tokens[MOBILE_IDX]), Long.parseLong(tokens[WORK_IDX]), Long.parseLong(tokens[HOME_IDX]));

                    persons.add(per);
                }
            }
            Collections.sort(persons);
            //Print the new student list
            for (Person pp : persons) {
                System.out.println(pp.toString());
            }
        }
        catch (Exception e) {
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

public class CsvPhoneDirectory {

    public static void main(String[] args) {
        String fileName ="Details.csv";
        
        System.out.println("\nRead CSV file:");
        CsvFileReader.readCsvFile(fileName);
        //System.out.println("Write CSV file:");
        //CsvFileWriter.writeCsvFile(fileName);
    }
}

