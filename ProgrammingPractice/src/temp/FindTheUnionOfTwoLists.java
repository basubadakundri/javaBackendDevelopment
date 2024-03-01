package temp;

import java.util.ArrayList;
import java.util.List;

public class FindTheUnionOfTwoLists {
		public static void main(String[] args) {
			List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 7, 9));
			List<Integer> list2 = new ArrayList<>(List.of(2, 3, 5, 6, 8, 9));

			List<Integer> unionElem = new ArrayList<>();

			for (int elem : list1) {
				if (!list2.contains(elem)) {
					unionElem.add(elem);
				}
			}
			for (int elem : list2) {
				if (!list1.contains(elem)) {
					unionElem.add(elem);
				}
			}
			System.out.println(unionElem);
		}


}
