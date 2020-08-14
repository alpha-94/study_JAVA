package exam10;

class Personal{
	private String perNum;
	private String name;
	
	
	Personal(String perNum, String name){
		this.perNum = perNum;
		this.name = name;
	}


	public String getPerNum() {
		return perNum;
	}


	public String getName() {
		return name;
	}
	
	
}

//class PersonalStorgeThirdparty extends PersonalStorge
class PersonalStorgeThirdparty implements PersonalStorge{//외주 개발사

	Personal[] perArr;
	int indexPerInfo;
	
	PersonalStorgeThirdparty(int number){
		perArr = new Personal[number];
		indexPerInfo = 0;
	}
	
	public void addPersonalInfo(String perNum, String name) {
		// TODO Auto-generated method stub
		perArr[indexPerInfo++] = new Personal(perNum, name);
		System.out.println("데이터 저장 완료.");
	}//저장 메서드 구현

	public String searchName(String perNum) {
		// TODO Auto-generated method stub
		for(int i =0;i<indexPerInfo;i++) {
			if(perNum.compareTo(perArr[i].getPerNum())==0) {
			return 	perArr[i].getName();
			}
		}
		return null;
		
	}

}
