import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class Students implements Comparable<Students> {
	int rollNo;
	String name;
	int marks;
	String department;
	
	public Students(int rollNo,String name,int marks,String department) {
		
		this.rollNo = rollNo;
		this.name= name;
		this.marks = marks;
		this.department = department;
		
	} 
	
	
	
	public int compareTo(Students st) {
		return this.marks-st.marks;
	}
	
	
	@Override
	public String toString() {
		return "Roll No: " + rollNo +
		           ", Name: " + name +
		           ", Marks: " + marks +
		           ", Department: " + department;
		
	}
	
	
}

public class College {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total number of students");
		int n = sc.nextInt();
		int rollNo = 0;
		String name=" ";
		int marks = 0;
		String department="";
		
		List<Students> student = new ArrayList<>();
		
		for(int i =0;i<n;i++) {
			
			System.out.println("Enter Rollno");
			rollNo = sc.nextInt();
			System.out.println("Enter the Name");
			name = sc.next();
			System.out.println("Enter marks");
			marks = sc.nextInt();
			System.out.println("Enter Department");
			department = sc.next();
			student.add(new Students(rollNo,name,marks,department));
			
		}
		
		System.out.println(student);
		
		Collections.sort(student);
		System.out.println("Sorted by Marks");
		System.out.println(student);
		
		Collections.sort(student,(s1,s2) -> s1.rollNo-s2.rollNo);
		
		System.out.println("sorted by RollNumber");
		
		
		System.out.println(student);
		
		
		Set<String> departments = new HashSet<>();
		
		for(Students stud : student) {
			
			departments.add(stud.department);
			
		}
		
		
		System.out.println("Unique Departments");
		for(String dept : departments) {
			System.out.println(dept);
		}
		
	    	
		Map<String ,List<Students>> StudentDept =  new HashMap<>();
		
		for(Students st : student) {
			
		        if(StudentDept.containsKey(st.department)) {
		        	
		        	StudentDept.get(st.department).add(st);
		        	
		        	
		        }
		        else {
		        	List<Students> newList = new ArrayList<>();
		        	newList.add(st);
		        	StudentDept.put(st.department,newList);
		        	
		        }
		}
		
		for(Map.Entry<String, List<Students>> entry : StudentDept.entrySet()) {
			
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		
       for(Map.Entry<String, List<Students>> entry : StudentDept.entrySet()) {
			
	        List<Students> studentDept = entry.getValue();
	       Students topStudent = Collections.max(studentDept, Comparator.comparingInt(s -> s.marks));
	       System.out.println("\nStudents in Department: " + entry.getKey());
	       System.out.println(topStudent);
	       for (Students s : studentDept) {
	           System.out.println(s);
	       }
		}
       
		
		
	}
}