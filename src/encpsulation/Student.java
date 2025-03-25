package encpsulation;

public class Student {
	public String name;
	public int id;
	public String email;
	public long phNo;
	public double marks;
	public boolean attendance;
	public float fees;
	
	/*public Student(String name,int id,String email,long phNo,double marks,boolean attendance,float fees) {
		this.name = name;
		this.id=id;
		this.email=email;
		this.phNo=phNo;
		this.marks=marks;
		this.attendance=attendance;
		this.fees=fees;
		
	}*/
	public void getName() {
		System.out.println("name is : "+ name);
	}
	public void getId() {
		System.out.println("Id is : "+ id);
	}
	public void getEmail() {
		System.out.println("Email is : "+ email);
	}
	public void getPhNo() {
		System.out.println("PhNo is : "+ phNo);
	}
	public void getMarks() {
		System.out.println("Marks is : "+ marks);
	}
	public void getAttendance() {
		System.out.println("Attendance is : "+ attendance);
	}
	public void getFees() {
		System.out.println("Fees is : "+ fees);
	}
	public void setName(String name) {
		this.name = name ;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email =email;
	}
	public void setMarks(double marks) {
		this.marks=marks ;
	}
	public void setPhNo(long  phNo) {
		this.phNo=phNo;
	}
	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}
	public void setFees(float fees) {
		this.fees =fees ;
	}

}
