package inputOutput;

public class AsappJobsClass2 {
	public static void main(String[] args) {
		DerivedClass d = new DerivedClass();
		d.foo();

	}
}

class BaseClass {
	protected void foo() {
		System.out.println("Base foo");
	}
}

class DerivedClass extends BaseClass {
	protected void foo() {
		System.out.println("Deriveded foo");
	}
}
