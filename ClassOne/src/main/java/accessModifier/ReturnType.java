package accessModifier;

public class ReturnType {

	public static void main(String[] args) {
		
		
		    int a = 5;
			int b = 10;
			
			int c = ReturnType.sum(55, b);
			
			System.out.println(a+b);
			System.out.println(c);
			System.out.println(a+b+sumX()); 
		
		}
		
		public static int sum(int x, int y) {
			return x+y;
		}
		
		public static String sumX() {
			System.out.println("Hello , from the SUM-X method");
			return "Mamun";
		}
		
		public static int sumY() {
			System.out.println("Hello , from the SUM-Y method");
			return 55;
		}
	}

	


