package exam04;


//JAVA BEAN
class UseDTO { // data transfer object(VO :: Value Object)
	private int deptno;
	private String dname;
	private String loc;
	
	//getter
	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
	
	//setter 
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	

}
