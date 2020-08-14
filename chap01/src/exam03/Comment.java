/*파일 이름 : Comment.java
작성자 : 김우현
작성일 : 2020.4.17(금)
프로그램 설명 : comment (주석문) 에 대한 실습 내용임..ㅎ 
*/
//  주석 유의점
// /* /* */ */ 이런식으로 중첩해서 사용하면 안됨 ㅎ 
package exam03;

public class Comment { //주석문 코멘트쓱
	
	public static void main(String[] args) {
		System.out.println(100+35);
		System.out.println(100-35);
		System.out.println(100/35); // 2만 결과 출력 봤을땐 정수만 출력 되는듯 ㅋ
		//System.out.println(100*35); 얜 필요없다고 생각되면 주석 달아버렷
		
		System.out.println("100+35");//""문자열 인식 ㅎ
		System.out.println("Hello"+",,,,"+"Java!!");//문자 더하기
		System.out.println(3.14+"는 실수입니다");		//결국 정수도 ""의 형태로
																		//받아들여짐
		System.out.println("100*35 =" + (100*35));
		
		System.out.println("2+5="  + (2 + 5) );
	}

}


