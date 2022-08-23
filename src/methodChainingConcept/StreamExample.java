package methodChainingConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple", "Orange", "Banana", "Grapes");
		
		//output should fruit will be added all fruits
		
		//first way
		
//		List<String> customNameList = new ArrayList<>();
//		for(String s: names) {
//			String newNameString = s + " Fruit";
//			customNameList.add(newNameString);
//		}
//		System.out.println("Before --> " + names);
//		System.out.println("After --> " + customNameList);
		
		
		//Second way Stream
		
//		Stream<String> nameStream = names.stream();
//		Stream<String> nameMapStream = nameStream.map(e -> e + " Fruit");
//		List<String> listNewNames = nameMapStream.collect(Collectors.toList());
//		System.out.println(listNewNames);
		
		//reducing code using method chaining
		
		//Stream<String> nameStream = names.stream();
		//Stream<String> nameMapStream = names.stream().map(e -> e + " Fruit");
		List<String> listNewNames = names.stream().map(e -> e + " Fruit").collect(Collectors.toList());
		System.out.println(listNewNames);

	}

}
