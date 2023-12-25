package inputOutput;

public class AsappJobsClass3 {
	public static void main(String[] args) {

		StringBuilder s1 = new StringBuilder("asapp");
		String s2 = "jobs";
		s1.append(s2);
		System.out.println(s1.substring(4));
		int index = s1.indexOf(s2);
		System.out.println(index);

	}
}

