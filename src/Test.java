import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		StringFormatter formatter = new StringFormatter(); 
		ArrayList test1 = new ArrayList(); 
		test1.add("AP"); 
		test1.add("Comp"); 
		test1.add("Sci"); 
		test1.add("rocks"); 

		System.out.println(formatter.format(test1, 20)); 
		
		ArrayList test2 = new ArrayList(); 
		test2.add("green"); 
		test2.add("eggs"); 
		test2.add("and"); 
		test2.add("ham"); 
		
		System.out.println(formatter.format(test2, 20)); 

		ArrayList test3 = new ArrayList(); 
		test3.add("Beach"); 
		test3.add("Ball"); 

		
		System.out.println(formatter.format(test3, 20)); 
		
	}
}
