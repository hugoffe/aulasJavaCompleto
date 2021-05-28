package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListProgram {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Marieta");
		list.add("Alex");
		list.add("Bob");	
		list.add("Anna");
		list.add("Marieta");
		list.add(2, "Alexandra");
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("==========================");
		System.out.println("apresentar o Index das instancias: Bob e Alexandra");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Alexandra: " + list.indexOf("Alexandra"));		
		System.out.println("===========================");
		System.out.println("Remover instâncias com letra M no início:");
		System.out.println("==========================");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("==========================");
		System.out.println("Montar uma lista com instâncias iniciadas por A");
		System.out.println("==========================");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("==========================");
		System.out.println("Apresentar a primeira instacia iniciada com A");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}

