package inputOutput;

public class AsappJobsClass {
	public static void main(String[] args) {
		Base x = new Base();
		Base y = new Derived();
		Derived z = new Derived();
		print(x);
		print(y);
		print(z);

	}

	static void print(Base base_obj) {
		base_obj.print();
	}
}

class Base {
	public void print() {
		System.out.println("Base class");
	}
}

class Derived extends Base {
	public void print() {
		System.out.println("Derived class");
	}
}
