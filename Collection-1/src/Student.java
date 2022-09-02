
public class Student {
	private String name;
	private int age;
	private boolean isCollegeStudent;
	private int rollNo;
	private boolean isMale;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setIsCollegeStudent (boolean isCollegeStudent) {
		this.isCollegeStudent=isCollegeStudent;
	}
	public boolean getIsCollegeStudent() {
		return isCollegeStudent;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getrollNo() {
		return rollNo;
	}
	
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	
	
	public Student (String name, int age, boolean isCollegeStudent, int rollNo, boolean isMale) {
		this.name=name;
		this.age=age;
		this.isCollegeStudent=isCollegeStudent;
		this.rollNo=rollNo;
		this.isMale=isMale;
	}
	
	public String toString() {
		return "NAME: "+name+", AGE: "+age+", COLLEGE STUDENT: "+isCollegeStudent+", ROLL NO: "+rollNo+", IS MALE: "+isMale;
	}

}
