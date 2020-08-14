package exam06;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing int
		Integer iValue = new Integer(10); 

		//Boxing double
		Double dValue = new Double(3.14);
		
		//Unboxing int
		int innum = iValue.intValue();// return type int 
		System.out.println(innum);

		//Unboxing double
		double dnum = dValue.doubleValue();// return type double
		System.out.println(dnum);
		
		//Unboxing & Boxing
		iValue = new Integer(iValue.intValue() + 10);
		System.out.println(iValue.intValue());
	
	}
	
	

}
