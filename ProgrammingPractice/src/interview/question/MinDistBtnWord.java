package interview.question;

public class MinDistBtnWord {

	public static void main(String[] args) {
		String st = "the sum of the num";
		String w1 = "sum";
		String w2 = "the";
		find(st, w1, w2);

	}

	public static int find(String st,String w1,String w2) {
		String[] arr = st.split(" ");
		if (w1 == w2) {
			return 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == w1) {

			}
		}
		return 0;
	}
}
