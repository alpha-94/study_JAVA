package prac02;

import java.util.Scanner;

class indexInfo{
	Scanner keyboard = new java.util.Scanner(System.in);
	String name;
	String hpnum;
	String addr;
	int age;
	
	indexInfo(){
		name = null;
		hpnum = null;
		addr = null;
		age = 0;
	}
	
	public void enterInfo(){
		
			
			System.out.print("Enter your Name?");
			
			name = keyboard.nextLine();
			System.out.println("Enter your Phone Number?");
			
			hpnum = keyboard.nextLine();
			System.out.print("Enter your Address?");
			
			addr = keyboard.nextLine();
			System.out.print("Enter your Age?");
			age= keyboard.nextInt();
			
			
			
			
	}
	
	public void ShowInfo() {
		System.out.println("Show information");
		
		
		System.out.println(" your Name is " + this.name);
		System.out.println(" your Phone Number is " + this.hpnum);
		System.out.println(" your  Address is " + this.addr);
		System.out.println(" your Age is " + this.age);
		
	}
	
	public String getName() {
		return name;
		
}
	
	
	
}



public class KeyArray {
	static Scanner keyboard = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check = 0;
		
		indexInfo [] man = new indexInfo[5];
		
		for(int i = 0; i <man.length; i++) {
			man[i] = new indexInfo();
		}
		
		do {
			Find();
			check = keyboard.nextInt();
			if(check==1) {
				for(int i = 0; i < man.length; i++) {
					if(man[i].getName() ==null) {
						man[i].enterInfo();
						break;
					}
				}
			}
			else if(check ==2) {
				Display(man);
			}
			else if(check==3) {
				String find = null;
				Scanner findName = new Scanner(System.in);
				System.out.println("enter your name");
				find = findName.nextLine();
				for(int i = 0; i < man.length; i++) {
					if(man[i].getName() !=null) {
						if(man[i].getName().compareTo(find)==0) {
							man[i].ShowInfo();
							break;
						}
					}
				}
			}
			else if(check==4) {
				break;
			}
			else {
				System.out.println("Exit");
			}
		}
		while(check!=4);
		
		
		
		
		
	}

	public static void Find() {
		System.out.println("What do you want");
		System.out.println("1. Enter input the Information");
		System.out.println("2. Find Information ");
		System.out.println("3. View Information");
		System.out.println("4. Exit");
	}
	
	public static void Display(indexInfo[] m) {
		for(int i = 0 ; i <m.length ; i ++) {
			if(m[i].getName() !=null) {
				m[i].ShowInfo();
			}
		}
		
	}
	
}
