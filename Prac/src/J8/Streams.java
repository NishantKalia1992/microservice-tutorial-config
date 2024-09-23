package J8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Doe","john");
		List<Integer> num = Arrays.asList(5,4,3,2,1,5,3);
		List<String> filteredNames = names.stream()
		                                  .filter(name -> name.startsWith("J"))
		                                  .collect(Collectors.toList());
		Stream<String> stream = names.stream();
		System.out.println(stream);
		System.out.println("===============");
		System.out.println(filteredNames);
		System.out.println("===============");
		
		List<String> collect = names.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("===============");
		
		List<Integer> list = num.stream().distinct().skip(1).collect(Collectors.toList());
		System.out.println(list);
		List<Integer> list2 = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list2);
		System.out.println("===============");
		num.stream().distinct().sorted().forEach(System.out::println);
		System.out.println("=======++========");
		num.stream().distinct().sorted().forEach(t -> System.out.println(t));
		System.out.println("===============");
		Optional<String> first = names.stream().findAny();
		System.out.println(first);
		System.out.println("===============");
		long count = num.stream().distinct().count();
		System.out.println(count);
		
	}
}
 