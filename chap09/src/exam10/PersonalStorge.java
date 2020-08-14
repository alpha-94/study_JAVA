package exam10;

//abstract class PersonalStorge {
interface PersonalStorge{//부모클래스로 사용하되 자식클래스는 오버라이딩을 반드시 해야한다는 의미
	/* public abstract */ void addPersonalInfo(String perNum, String name);

	/* public abstract */ String searchName(String perNum);
	
}
