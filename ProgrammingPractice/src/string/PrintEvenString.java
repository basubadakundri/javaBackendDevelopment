package string;

public class PrintEvenString {

	public static void main(String[] args) {
		String str = "hello word this is lucky";

		for (String world : str.split(" ")) {
			if (world.length() % 2 == 0) {
				System.out.println(world);
			}
		}
	}

}
