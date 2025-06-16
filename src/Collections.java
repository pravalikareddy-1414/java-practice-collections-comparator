import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections{
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			
		   num.add(i);
	    }
		
		
		 num.removeIf(n->n%2==0);
			
		
		System.out.println(num);
		
		
		//set
		
		Set<String> names = new LinkedHashSet<>();
		names.add("hari");
		names.add("SAi");
		names.add("hari");
		names.add("sree");
		
		System.out.println(names);
		
		
		//Map
		Map<Integer, String> student = new HashMap<>();
		student.put(10, "prava");
		student.put(12, "hari");
		student.put(14, "kiran");
		student.put(15, "sai");
		
		System.out.println(student.get(12));
		
		
		
		//List occurances
		
	    List<String> person = new ArrayList<>();
	    person.add("sai");
	    person.add("hari");
	    person.add("sri");
	    person.add("kiran");
	    person.add("hari");
	    person.add("reddy");
	    
	    
	    
	    Map<String ,Integer> namecon = new HashMap<>();
	    
	    for(String name : person) {
	    
	    	if(namecon.containsKey(name)){
	    		namecon.put(name, namecon.get(name)+1);
	    	}
	    	else {
	    		namecon.put(name, 1);
	    	}
	    }
	    System.out.println(namecon);
	    
	    
	    
	    
	    
		
	}
	
	
	
}