package interview.question;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class RomanConverter2 {
    public static List<String> romanizer(List<Integer> numbers) {
        List<String> result = new ArrayList<>();

		HashMap<Integer, String> romanMap = new LinkedHashMap<>();
		romanMap.put(100, "C");
		romanMap.put(90, "XC");
		romanMap.put(50, "L");
		romanMap.put(40, "XL");
		romanMap.put(10, "X");
		romanMap.put(9, "IX");
		romanMap.put(5, "V");
		romanMap.put(4, "IV");
		romanMap.put(1, "I");

        for (int num : numbers) {
            StringBuilder romanNumeral = new StringBuilder();

			for (int arabic : romanMap.keySet()) {
				while (num >= arabic) {
					romanNumeral.append(romanMap.get(arabic));
					num -= arabic;
                }
            }

            result.add(romanNumeral.toString());
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> romanNumerals = romanizer(numbers);

        System.out.println("Roman Numerals:");
        for (String numeral : romanNumerals) {
            System.out.println(numeral);
        }
    }
}
