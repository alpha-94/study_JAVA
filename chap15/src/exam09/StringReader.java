package exam09;

import java.io.*;

public class StringReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader inBufferedReader = new BufferedReader(new FileReader("String.txt"));
			String str = null;
			
			
			while (true) {
				str = inBufferedReader.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
			}
			inBufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
