package bootcamp;

import java.util.List;

public class Main {
public static void main(String[] args) {
	int count=0;
	List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
	for(int numero : numbers) {
		if(numero > 10) {
			count++;
		}
	}
	
	Long count2 = numbers.stream().filter(num -> num > 10).count();
	System.out.println(count2);
}
}
