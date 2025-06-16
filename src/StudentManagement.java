import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentManagement{
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<>();
		  names.addAll(Arrays.asList("Hari", "Sai", "Kiran", "Sree","Sree","ram","neon"));
		  
		Set<String> student = new HashSet<>(names);
		System.out.println(student);
		
		
		Map<String ,Integer> StudentMarks = new HashMap<>();
		
		for(String stud : student) {
			if(stud.equals("Hari")) {
				StudentMarks.put(stud, 90);
			}
			else if(stud.equals("Sai")){
				StudentMarks.put(stud,85);
			}
			else if(stud.equals("Kiran"))
			{
				StudentMarks.put(stud, 82);
			}
			else if(stud.equals("ram")) {
				StudentMarks.put(stud, 99);
			}
			else if(stud.equals("neon")) {
				StudentMarks.put(stud, 99);
			}

		}
		
		Map<String ,Integer> StudentMark = new TreeMap<>(StudentMarks);
		
		System.out.println(StudentMark);
		

		Map<String ,Integer> StudentOrder = new LinkedHashMap<>(StudentMark);
		
		System.out.println(StudentOrder);
	
		 
	}
}