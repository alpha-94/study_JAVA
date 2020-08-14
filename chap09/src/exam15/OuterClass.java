package exam15;

interface Readerble{
	public void read();
}

class OuterClass {
	
	private String name;
	
	OuterClass(String name){
		this.name = name;
	}

	
	public Readerble createLocalClssInst(final int num) {//메서드 내 클래스 선언, final 상수화
		return new Readerble() {//인터페이스는 추상메서드기때문에 new 를 사용 못하지만 다이렉트로 오버라이딩
			//시키면 인스턴스화가 가능하다.

			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("LocalClass read() : " + name);
				System.out.println("num : " + num);
			}
			};
		
		
//		class LocalClass implements Readerble{
//			public void read() {
//				System.out.println("LocalClass read() : " + name);
//				System.out.println("num : " + num);
//			}
//		}
//		
////		LocalClass localClass = new LocalClass();
//		Readerble localClass = new LocalClass();
//		return localClass;
	}
}
