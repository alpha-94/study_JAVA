package exam04;

public class BuilderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		StringBuilder StringBuilder=new StringBuilder("AB");
		
		System.out.println(StringBuilder);
		
//		StringBuilder.append(25);
//		StringBuilder.append('Y');
//		StringBuilder.append(true);
//		StringBuilder.append(44.4);
		
		StringBuilder.append(25).append('Y').append(true).append(44.4);
		
		System.out.println(StringBuilder);
		
		StringBuilder.insert(2, false);
		System.out.println(StringBuilder);
	}

}
