package exam14;

interface Readerble{
	public void read();
}

class OuterClass {
	
	private String name;
	
	OuterClass(String name){
		this.name = name;
	}

	
	public Readerble createLocalClssInst(final int num) {//메서드 내 클래스 선언, final 상수화
		class LocalClass implements Readerble{
			public void read() {
				System.out.println("LocalClass read() : " + name);
				System.out.println("num : " + num);
			}
		}
		
//		LocalClass localClass = new LocalClass();
		Readerble localClass = new LocalClass();
		return localClass;
	}
}
