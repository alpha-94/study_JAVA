package prac01;

 class High extends MotherClass{

	 public String job;
	 
	 High(){
		 super();
		 job = null;
		 
	 }
	 public void HighInfo() {
		 MoInfo();
		 System.out.printf("your job is %s\n",job);
		 
		 
		
	 }
	 
	 public void HighenterInfo(){
			
			
			enterInfo();
			
			System.out.printf("Enter your job\n?");
			job = keyboard.nextLine();
			

		}
	 
}
