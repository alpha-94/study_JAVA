package exam08;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UseCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar today = Calendar.getInstance();
		
		//new 로 생성자 호출 후 인스턴스화 하는게 아닌 메서드 호출로 매개변수 할당
		int year = today.get(Calendar.YEAR);
		System.out.printf("%d 년\n",year);
		
		int month = today.get(Calendar.MONTH)+1;
		System.out.printf("%d 월\n",month);
		
		int day = today.get(Calendar.DAY_OF_MONTH);
		System.out.printf("%d 일\n",day);
		
		
		System.out.printf("%d 년 %d 월 %d 일 ",year,month,day);
		
		SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		Date getNowDate = (Date) today.getTime();
		
		String dateString = sdfDateFormat.format(getNowDate);
		
		
		Date d1 = new Date(today.getTimeInMillis());
		
		Date d2 = new Date(day);
		Calendar cal = Calendar.getInstance();
		
		
		cal.setTime(d2);
		
		
		
		
		
	}

}
