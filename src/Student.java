import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Stud implements Comparable<Stud>{
	String name;
	int marks;
	int rollNo;
	
	public Stud(String name,int marks,int rollNo)
	{
		this.name = name;
		this.marks=marks;
		this.rollNo = rollNo;
	}
	
	public int compareTo(Stud s) {
		
		return this.marks- s.marks;
		
	}
	
	@Override
	public String toString() {
		return "Stud{name='" + name + "', marks=" + marks + ", rollNo=" + rollNo + "}";
	}
	
}




public class Student {
   
	public static void main(String[] args)
	{
		
	    Scanner sc = new Scanner(System.in) ;
	     
	    List<Stud> s = new ArrayList<>();
	    
	    s.add(new Stud("prava", 20, 2));
	    s.add(new Stud("hari", 2, 3));	
	    s.add(new Stud("neon", 29, 7));
	    s.add(new Stud("gray", 5, 8));		
	    s.add(new Stud("seon", 67, 9)); 
	    
	    Collections.sort(s);
	    
	    for (Stud student : s) {
	        System.out.println(student);
	    }
	      
		
	}
	
}