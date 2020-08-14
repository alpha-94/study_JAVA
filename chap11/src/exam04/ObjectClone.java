package exam04;

public class ObjectClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point org = new Point(2,3);
		Point copyPoint = null;
		System.out.println(org);
		
		try {
			copyPoint = (Point)org.clone();
			
			org.showPosition();
			copyPoint.showPosition();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("예외발생");
		}
		

	}

}
