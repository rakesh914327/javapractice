package encpsulation;

public class EmployeeDetails {
	public String name;
	public int id;
	public String designation;
	public double salary;
	public long ph;
	public String location;
	public String email;
	public String company;
	public float allowances;
	public boolean married;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getAllowances() {
		return allowances;
	}
	public void setAllowances(float allowances) {
		this.allowances = allowances;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public EmployeeDetails(String name, int id, String designation, double salary, long ph, String location,
			String email, String company, float allowances, boolean married) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
		this.ph = ph;
		this.location = location;
		this.email = email;
		this.company = company;
		this.allowances = allowances;
		this.married = married;
	}
	

}
