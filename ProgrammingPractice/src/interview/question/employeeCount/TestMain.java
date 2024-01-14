package interview.question.employeeCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List<Employee> em = new ArrayList<>();
		em.add(new Employee("E40001", "Raghu", "manager", 41));
		em.add(new Employee("E40002", "ram", "enginner", 21));
		em.add(new Employee("E40003", "hari", "enginner2", 45));
		em.add(new Employee("E40004", "Raghu", "teamlead", 61));
		em.add(new Employee("E40005", "ram", "teamlead", 84));

		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < em.size(); i++) {
			Employee emp = em.get(i);
			if (hm.containsKey(emp.getName())) {
				hm.put(emp.getName(), hm.get(emp.getName()) + 1);
			} else {
				hm.put(emp.getName(), 1);
			}
		}
		System.out.println(hm);
	}
}
