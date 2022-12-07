public class Faculty {

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	public Employee dean;
	public String name;

	public Employee getDean() {
		return dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}