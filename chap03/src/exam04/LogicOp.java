package exam04;

public class LogicOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean X = false , Y = false;
		
		System.out.println(X + "&&" + Y + "="  + (X && Y));
		System.out.println(X + "||" + Y + "="  + ( X|| Y));
		
		X = false ; Y = true;
		
		System.out.println(X + "&&" + Y + "="  + (X&&Y));
		System.out.println(X + "||" + Y + "=" +  (X||Y));
		
		X = true ; Y = false;
		
		System.out.println(X + "&&" + Y + "="  + (X&&Y));
		System.out.println(X + "||" + Y + "=" +  (X||Y));
		
		
		
		
		
	}

}
