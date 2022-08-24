package SimpliLearn;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String args[])
	{
		List<Integer> stream = new ArrayList<>();
		stream.add(10);
		stream.add(20);
		stream.add(30);
		stream.add(40);
		
//		List<Integer> square = new ArrayList<>();
//		for(int i: stream)
//		{
//		   square.add(i*i);
//		}
//		System.out.println("Square of elements :" + square);
		
		List<Integer> square = stream.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("Square of elements :" + square);
		
//		Set<Integer> listToSet = new HashSet<>();
//		for(int i : stream)
//		{
//			listToSet.add(i*i);
//		}
//		System.out.println("Square of elements :" + listToSet);
//		
		Set<Integer> listTOSet = stream.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println("Square of elements :" + listTOSet);
		
		List<String> languages = new ArrayList<>();
		languages.add("Python");
		languages.add("JAVA");
		languages.add("Scala");
		
//		List<String> PLanguage = new ArrayList<>();
//		for(String i :languages)
//		{
//			if(i.startsWith("P"))
//			{
//				PLanguage.add(i);
//			}
//		}
//		System.out.println("Languages starts with P :" + PLanguage);
		
		List<String> PLanguage = languages.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList());
		System.out.println("Languages starts with P :" + PLanguage);
		
		List<String> sort = languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Languages after sorting :" + sort);
		
		System.out.println("Elements are :");
		languages.stream().forEach(y -> System.out.println("Element is :"+y));
		
		languages.stream().forEach(y -> {
			System.out.println("This is multiple lines for each loop..");
			System.out.println("Element is :" + y);
		});
		
		// demonstration of reduce method
		//Identity-an element that is the initial value of the reduction operation
		//and the default result if the stream is empty
		//Accumulator -a function that takes two parameters:
		//a partial result of the reduction operation and the next element of the stream
		//Combiner a function used to combine the partial result of the reduction operation
		//when the reduction is parallelized, or when there's a mismatch between the types of the accumulator
		//arguments and the types of the accumulator implementation
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(60);
		
		int sum = numbersList.stream().reduce(0,(ans,i)-> ans+i);
		System.out.println("sum of all elements in the numberlist:" +sum);
}
}