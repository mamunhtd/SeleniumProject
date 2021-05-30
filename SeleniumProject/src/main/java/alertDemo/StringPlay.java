package alertDemo;

public class StringPlay {

	

	public static void main(String[] args) {
		
		String a = "mamun";
		String b = "apa";
		
		int x = 10;
		int y = 20;
		
		System.out.println(x+y);
	
		
		
		System.out.println(a.length());
		System.out.println(a.length()-1);
		System.out.println(b.length()-2);
		
		System.out.println(a.concat(b));
		System.out.println(a + "  " + b);
		
		
		String c = "ABCdef";
		String lowerCase = c.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(c.toUpperCase());

		
		String d = "Marry";
		String Replce = d.replace("M", "C");
		System.out.println(Replce);
		
		String repAll = d.replaceAll("Marry", "Mamun");
		System.out.println(repAll);
		
		
		
	}

}
