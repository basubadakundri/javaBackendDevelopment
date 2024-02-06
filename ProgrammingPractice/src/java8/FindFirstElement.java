package java8;

import java.util.ArrayList;
import java.util.List;

public class FindFirstElement{
  public static void main(String args[]) {
		List<Integer> myList = new ArrayList<>();
		myList.stream().findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("List is empty"));
  }
}