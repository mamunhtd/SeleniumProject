package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Learn_Map {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		//Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
          //Map<String, Integer> mp = new LinkedHashMap<String, Integer>();// Result order depends on Implementation classes
          mp.put("Ashraf", 111);
          mp.put("Emad", 123);
          mp.put("Hasan", 800);
          mp.put("Nilufar", 347);
          mp.put("Abc", 123);
          mp.put("Nilufar", 444);
          mp.put("Hasan", 222);
          mp.put("Mahtab", 555);
          mp.put("Ashraf", 007);
       
       
          
          
          for (Entry<String, Integer> eachMP : mp.entrySet()) {
        	  System.out.println(eachMP.getKey() +"   "+ eachMP.getValue());
        	  		//		System.out.println( a +"  "+ b);
		}
        /* for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          }*/
        
         System.out.println(".........................");              
          // get count of Map entry -size()
         System.out.println(mp.size());
          
        
         System.out.println(".........................");
          
          //get();
        System.out.println(mp.get("Nilufar"));
          
          //Remove()
         mp.remove("Hasan"); // just pass the Key
          
         
         System.out.println(".........................");
          
          //after remove Size of Map items
        System.out.println(mp.size());
          
          //System.out.println(".........................");
          
          //ContainsKey()-Search by the Key
         System.out.println(mp.containsKey("Nilufar")); //true/false
          
          System.out.println(".........................");
          
          //ContainsValue- Search by Value
         System.out.println(mp.containsValue(444)); //true/false
          
          //clear();
       //  mp.clear(); //Removes all Map data/entry
          
          System.out.println(".........................");
          
         System.out.println(mp.size());
          
          //System.out.println(".........................");
          
          System.out.println(mp.isEmpty());
        
          System.out.println(".........................");
          
          for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          }
          
          
         // for Each loop (Single dimension-List & Set)
          
         /* for(datatype VariableName : Collection) { // collection = List or Set
        	  
          }
          */
          
          //Map (2 dimension)
          
        /*  for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "   " + eachMp.getValue());
          }*/
          
          String a = "Atia";
          int b = 10;
          String c ="       Mamun";
          int d = 20;
          
      //    System.out.println(a.concat(b));
          System.out.println( a +""+ b);
         // System.out.println(a.concat(c));
          System.out.println(b+d);
          System.out.println(a+c);
          System.out.println(c.trim());
          System.out.println(c);
         
          
          
          

	}
		
		

	

}
