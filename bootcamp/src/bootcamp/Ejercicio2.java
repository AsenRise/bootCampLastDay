package bootcamp;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Arrays.asList(1, 2, 3, 4).stream()
        .map(elementoArray -> "Number " + String.valueOf(elementoArray))
        .forEach(n -> System.out.println(n + " as a " + n.getClass().getName()));
		
		   System.out.println();
	        System.out.println("*********** Si quisiéramos persistir en este cambio, haríamos collect() los datos de nuevo  ****************");
	        System.out.println("*********** en un Collection objeto como un List, Map, Set, etc ****************");
	        List<Integer> list = Arrays.asList(1, 4, 3, 5);
	        List<String> mappedList = list.stream()
	                .map(n -> "Number " + String.valueOf(n))
	                .collect(Collectors.toList());
	        System.out.println(list);
	        System.out.println(mappedList);
	        System.out.println();
	        System.out.println("*********** convierta un flujo de cadenas en un flujo de enteros ****************");
	        Arrays.asList("1", "2", "3", "4").stream()
	                .map(n -> Integer.parseInt(n))
	                .forEach(n -> System.out.println(n));
	    }
	}

