package accessModifier;

public class MethodWithArgs {
	
	
	

	public static void main(String[] args) {
		
		
		
		System.out.println("This is a Main Method");
		
		
		String b = "Boy";
		int a = 40;
		
		boolean c = true;
		
	//	MethodWithArgs.sum(name, num);
		sum("Mamun",20);
		
		sum(b,a);
		
		
		MethodWithArgs obj = new MethodWithArgs();
		obj.sum1();

	}
	
	// parameterized method
	
	public static void sum(String name, int num) {  
		
		System.out.println("This is a Sum Method");
		
		System.out.println(name); 
		System.out.println(num);
		
		name = "My own msg";
		num = 30;
		
		System.out.println(name);
		System.out.println(num);
		
		name = "best";
		num = 10;
		
		System.out.println(name);
		System.out.println(num);
		
		
		
	}
	public  void sum1() { 
		System.out.println("hi");
		
	}

}
