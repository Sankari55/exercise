import java.io.*;
import java.util.*;

class Car{
	private int speed;
	private double regularPrice;
	private String color;

	public Car(){ }

	public Car(int speed, double regularPrice, String color){
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}

	public double getSalePrice(){
		if(speed>100 && speed<200){
			regularPrice=regularPrice+(regularPrice*5/100);
		}
		else if(speed>200){
			regularPrice=regularPrice+(regularPrice*20/100);
		}
		else{
			System.out.println("Enter Speed greater than 100");
			return 0;
		}
		if(color=="red"||color=="black"){
			regularPrice=regularPrice+(regularPrice*2/100);
		}
		return regularPrice;
	}

	public void display(){
		System.out.println("Speed:"+speed+"\nColor:"+color+"\nSale Price:"+regularPrice);
	}
}

class Truck extends Car{
	private int weight;

	public double getSalePrice(){
		double price=super.getSalePrice();
		if(weight>2000){
			price=price-(price*10/100);
		}
		return price;
	}
}

class Ford extends Car{
	private int year;
	private int manufacturerDiscount;

	public Ford(int year,int manufacturerDiscount){
		super(250,700000,"gray");
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}

	public double getSalePrice(){
		double price=super.getSalePrice();
		price=price-manufacturerDiscount;
		return price;
	}

	public void display(){
		System.out.println("Ford:\nManufactured Year:"+year+"\nDiscount for Manufacturer:"+manufacturerDiscount);
	    super.display();
	}
}

class Sedan extends Car{
	private int length;

	public Sedan(int length){
		super(300,1000000,"red");
		this.length=length;
	}

	public double getSalePrice(){
		double price=super.getSalePrice();
		if(length>20){
			price=price-(price*5/100);
		}
		else{
			price=price-(price*10/100);
		}
		return price;
	}

	public void display(){
		System.out.println("Sedan:\nLength:"+length);
		super.display();
	}
}

class MyOwnAutoShop{
	public static void main(String args[]){
		Sedan s1=new Sedan(30);
		Ford f1=new Ford(2014,50000);
		Ford f2=new Ford(2012,100000);
		Car c1=new Car(200,800000,"blue");
		
		System.out.println("Price Details:");
		System.out.println("Sedan: "+s1.getSalePrice());
		System.out.println("Ford: f1: "+f1.getSalePrice());
		System.out.println("Ford: f2: "+f2.getSalePrice());

		System.out.println("\nModel Details:");
		s1.display();
		f1.display();
		f2.display();
	}
}