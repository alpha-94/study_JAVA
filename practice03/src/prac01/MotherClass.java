package prac01;
import java.util.Scanner;

public class MotherClass {
	
	Scanner keyboard = new java.util.Scanner(System.in);

	public String name ;
	public String phone;
	public String addr;
	
	MotherClass(){
		 name=null;
		 phone=null;
		 addr=null;
	}
	
	public void MoInfo() {
		
		System.out.printf("your name is %s\n",name);
//		getName();
		System.out.printf("your name is %s\n",phone);
		System.out.printf("your name is %s\n",addr);
		
		
	}
	
	public String getname() {
		return name;
//		return phone;
//		return addr;
	}
	
	public String getphone() {
		return phone;
	}
	
	public String getaddr() {
		return addr;
	}
	
	public void enterInfo(){
		
		
		System.out.printf("Enter your name\n?");
		name = keyboard.nextLine();
		
		getname();
		
		System.out.printf("Enter your phone\n?");
		phone = keyboard.nextLine();
		
		getphone();
		
		System.out.printf("Enter your address\n?");
		addr = keyboard.nextLine();
		
		getaddr();
		
	}
}
