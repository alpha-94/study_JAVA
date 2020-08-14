package prac01;

public class Middle extends MotherClass{

	public String Class;
	 
	 Middle(){
		
		 super();
		 Class= null;
		 
	 }
	 
	 public void MiddleInfo() {
		 MoInfo();
		 System.out.printf("your name is %s\n",Class);
		 
		 
	 }
	 public void MiddleenterInfo(){
			
			
			enterInfo();
			
			System.out.printf("Enter your Class\n?");
			Class = keyboard.nextLine();
			
			

		}
	 
}
