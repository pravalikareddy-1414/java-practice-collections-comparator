import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VoterManagement{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		
			Set<String> voternames = new HashSet<>();
			
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the name");
				String names = sc.nextLine();
				voternames.add(names);
			}
			
		   System.out.println(voternames);
		   Map<String ,Integer> Voter = new HashMap<>();
		   
		   for(String vt :voternames) {
			   System.out.println("Enter the age");
			   int age = sc.nextInt();
			   Voter.put(vt, age);
		   }
		   
		   for(Map.Entry<String, Integer> value : Voter.entrySet()) {
			   
			   System.out.println("   Voter  " + value.getKey() + "  age   " + value.getValue() );
		   }
	}
	
}