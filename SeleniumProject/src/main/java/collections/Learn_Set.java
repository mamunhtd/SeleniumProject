package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import coditionStatement.For_Loop_Statement;

public class Learn_Set {

	public static void main(String[] args) {
	
		
		//Set<Integer> obj = new HashSet<Integer>();
				Set<Integer> obt = new TreeSet<Integer>();
				
				Set<Integer> obj = new HashSet<Integer>();
				//Set<Integer> obj = new TreeSet<Integer>();
			//Set<Integer> obj = new LinkedHashSet<Integer>();
				
				
				//1. add items in Set- use add()
				
				obj.add(100);
				obj.add(101);
				obj.add(125);
				obj.add(721);
				obj.add(123);
				obj.add(456);
				obj.add(101112);
				obj.add(789);
				obj.add(123);
				//obj.add(000);
				obj.add(789);
				
				//2. Get count of Set- use size()
				//System.out.println(obj.size());
					System.out.println(obj.size());
				
				System.out.println("..................................");
				
				//3. print/display all items in the Set -use foreach
				
				
				for (Integer eachObj : obj) {
					System.out.println(eachObj);
				}
				
				/*for (Integer eachObj : obj) {
					System.out.println(eachObj);
					
				}*/
				
				System.out.println("******");
				
				
				
				//5. Check particular item from set- use contains() -output-true/false
				System.out.println(obj.contains(101112));
				
				System.out.println("==============================");
				
				//4.remove item from Set - use remove(item)
				obj.remove(100);
				System.out.println("===============================");
				//after remove item
				for (Integer eachobj : obj) {
					System.out.println(eachobj);
				}
				
				System.out.println("++++++++++++++++++++++++++");
				
				//after remove item
				System.out.println(obj.size());
				
				//System.out.println("******");
				
				//System.out.println(obj.contains(123));
				
				//System.out.println(obj.contains(101112));
				
				System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,");
				
			//	6. clear all items from Set - use obj.clear()
				obj.clear();
				
				System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,");
				//7. Confirm set is Empty or not- use isEmpty()- output- true/false
				System.out.println( obj.isEmpty()  );
			
				System.out.println("''''''''''''''''''''''''''''''");
				
				obj.size();
				
				
				
		

	}

}
