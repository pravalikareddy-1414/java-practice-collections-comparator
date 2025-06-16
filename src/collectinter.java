import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class collectinter{
	public static void main(String[] args)
	{
		List<Integer> num = new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			
		   num.add(i);
	    }
		for(int n:num)
		{
			System.out.println(n);
		}
		for(int i=0;i<num.size();i++)
		{
			System.out.println(i);
		}
			
		
		
		
		Set<String> names = new TreeSet<>();
		names.add("hari");
		names.add("SAi");
		names.add("hari");
		names.add("sree");
		
		System.out.println(names);
		
		
		Map<Integer, String> student = new TreeMap<>();
		student.put(10, "prava");
		student.put(17, "hari");
		student.put(14, "kiran");
		student.put(9, "sai");
		
		
		System.out.println(student);
		
		Map<Integer, String> students = new HashMap<>();
		student.put(10, "prava");
		student.put(17, "hari");
		student.put(14, "kiran");
		student.put(9, "sai");
		
		
		
		
		
		
		System.out.println(student);
		
	}
}