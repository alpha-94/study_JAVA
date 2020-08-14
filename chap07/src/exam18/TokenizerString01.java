package exam18;

import java.util.StringTokenizer;

public class TokenizerString01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "11:22:33:44:55";
		
		StringTokenizer st = new StringTokenizer(data,":");
		
		while(st.hasMoreTokens()) {
			System.out.println( st.nextToken());
		}
		//토큰 틀
		
		
	}

}
