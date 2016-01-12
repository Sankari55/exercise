import java.io.*;
import java.util.*;
class Student{
	private String studentName;
	private int id;
	private String gender;
    Subject sub;
	Scanner inp=new Scanner(System.in);
    
    void setName(String name){
        studentName=name;
    }
    void setId(int id){
        this.id=id;
    }
    void setGender(String gender){
        this.gender=gender;
    }
    String getName(){
        return studentName;
    }
    int getId(){
        return id;
    }
    String getGender(){
        return gender;
    }
}

class Subject{
	String subject1;
	String subject2;
    String subject3;
	float mark1;
	float mark2;
    float mark3;
    
    void setSub1(String name){
        subject1=name;
    }
    void setSub2(String name){
        subject2=name;
    }
    void setSub3(String name){
        subject3=name;
    }
    void setMark1(float mark){
        mark1=mark;
    }
    void setMark2(float mark){
        mark2=mark;
    }
    void setMark3(float mark){
        mark3=mark;
    }
    String getSub1(){
        return subject1;
    }
    String getSub2(){
        return subject2;
    }
    String getSub3(){
        return subject3;
    }
    float getMark1(){
        return mark1;
    }
    float getMark2(){
        return mark2;
    }
    float getMark3(){
        return mark3;
    }
}
class Result{
    static void generateResult(Student std){
            
            System.out.println("name:"+std.getName());
            System.out.println("ID:"+std.getId());
            System.out.println("gender:"+std.getGender());
            System.out.println(std.sub.getSub1()+" "+std.sub.getSub2()+" "+std.sub.getSub3());
            System.out.println(std.sub.getMark1()+" "+std.sub.getMark2()+" "+std.sub.getMark3());
            System.out.println("Total:"+(std.sub.getMark1()+std.sub.getMark2()+std.sub.getMark3()));
            System.out.println("Average:"+(std.sub.getMark1()+std.sub.getMark2()+std.sub.getMark3())/3);
        }    
}


class StudentDemo{

	void storeStudentData(Student std){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Student details:\nName:");
        String name=in.next();
        System.out.println("ID:");
        int id=in.nextInt();
        System.out.println("Gender(male/female):");
        String gender=in.next();
        std.setName(name);
        std.setId(id);
        std.setGender(gender);
        System.out.println("Enter Subject and Marks Details:\nSubject1:");
        String sub1=in.next();
        System.out.println("Mark1:");
        float mark1=in.nextFloat();
        System.out.println("Subject2");
        String sub2=in.next();
        System.out.println("Mark2:");
        float mark2=in.nextFloat();
        System.out.println("Subject3");
        String sub3=in.next();
        System.out.println("Mark3");
        float mark3=in.nextFloat();
        std.sub.setSub1(sub1);
        std.sub.setSub2(sub2);
        std.sub.setSub3(sub3);
        std.sub.setMark1(mark1);
        std.sub.setMark2(mark2);
        std.sub.setMark3(mark3);
	}

	public static void main(String args[]){

		Student stdObj=new Student();
		StudentDemo sd=new StudentDemo();
		sd.storeStudentData(stdObj);
		Result rs=new Result();
		rs.generateResult(stdObj);
        }
}