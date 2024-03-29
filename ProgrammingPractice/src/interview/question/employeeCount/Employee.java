package interview.question.employeeCount;

public class Employee {
	private String id;
	private String name;
	private String role;
	private int age;

	public Employee(String id, String name, String role, int age) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
