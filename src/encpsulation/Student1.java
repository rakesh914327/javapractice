package encpsulation;

public class Student1 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAttendance(false);
		s.setEmail("rakesh143@gmail.com");
		s.setFees(200000.00f);
		s.setId(143);
		s.setMarks(99.99);
		s.setPhNo(9999999999l);
		s.setName("Rakesh");
		s.getName();
		s.getId();
		s.getEmail();
		s.getPhNo();
		s.getMarks();
		s.getAttendance();
		s.getFees();
	}

}
