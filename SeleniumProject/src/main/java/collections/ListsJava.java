package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ListsJava {
	
	
	public static void main(String[] args) {
		
		//Restriction:  Which means You just put the number that means you fixed that,
		
		/*
		 * String[] names = new String[10]; names [0] = "A"; names [1] = "B"; names [2]
		 * = "C"; names [3] = "D"; names [4] = "E"; names [5] = "E";
		 * 
		 * System.out.println(names[9]);
		 */
		

		//Dynamic Array : SIze will increase  as you put more items in 
		
		//List is a Interface
		//ArrayList and LinkedList Comes under the List

		//ArrayList and LinkedList
		
		//Formula for java collectoin: List
		
//		Number one approch
//		 List<DataTypeObject> ObjectName = new TypeOfList<DataTypeObject>();
		
		
		
		List<String> NameList = new ArrayList<String>();
		NameList.add("Atia Apa");
		NameList.add("Hasan Vai");
		NameList.add("Sumayla Apa");
		NameList.add("Zarin Apa");
		NameList.add("Nilufar Apa");
		NameList.add("Mahtab Vai");
		NameList.add("Mamun");
		NameList.add("Mamun");
		NameList.add("Ashraf vai");
		NameList.add("Eamd vai");
		
		System.out.println(NameList.size());
		System.out.println(NameList.get(3));
		System.out.println(NameList.remove(7));
		
		System.out.println(NameList.size());
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		NameList.add("ABCD");
		System.out.println(NameList.size());
		
		System.out.println("=================================");	
		
		NameList.add(8, "Ashraf vai");
	
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
	
		
		for (int i =0; i<NameList.size() ;i++ ) {
			System.out.println(NameList.get(i));
			
		}
		
	
		
		System.out.println("---------------------------------------");
		
		System.out.println(NameList.contains("Mamun"));
		System.out.println(NameList.contains("AAAA"));
//		
		NameList.clear();
		System.out.println(NameList.isEmpty());
		System.out.println(NameList.size());
	
		


		
		
//		Number two approch	, 

//		TypeOfList<DataTypeObject> ObjectName = new TypeOfList<DataTypeObject>();
		
		LinkedList<Integer> Idlist = new LinkedList<Integer>();
		Idlist.add(1);
		Idlist.add(2);
		Idlist.add(3);
		Idlist.add(4);
		Idlist.add(5);
		Idlist.add(6);
		Idlist.add(7);
		Idlist.add(8);
		Idlist.add(10);
		Idlist.add(11);
		/*
		 * for(Integer e : Idlist ) { System.out.println(e +"" +NameList);
		 * 
		 * }
		 */
		
	
		
		for (int i = 1;i<NameList.indexOf(Idlist); i++) {
			System.out.println(i);
		}
			
		
		
		List<Integer> NumList = new ArrayList<Integer>();
		NumList.add(1);
		NumList.add(30);
		NumList.add(20);
		NumList.add(8);
		NumList.add(10);
		NumList.add(4);
		NumList.add(7);
		
		System.out.print(NumList);
		
		
		System.out.print("+++++++++++++++++++++++++++++");
		
		Collections.sort(NumList);

	    for (int i : NumList) {
	      System.out.println(i);
	    }
		 
		
//			Inside the DataType Has to be a OjectType	 
//		    like String is a reffernce is a objectType automaticaly	
	
	    
//		Number two approch	, 

//		TypeOfMap<DataTypeObject> ObjectName = new TypeOfMap<DataTypeObject>();
		
	    
	    
	    HashMap<String, Integer> NameId = new HashMap<String, Integer>();
	    NameId.put("Atia Apa", 1);
	    NameId.put("Hasan", 2);
	    NameId.put("Nilufar", 3);
	    NameId.put("Emad", 4);
	    NameId.put("Ashraf", 5);
	    NameId.put("Emad", 6);
	  
	    
	    System.out.println(NameId); 
	    
	    
	   
	    
		
		
	}
	
}
