package accessModifier;


public class Animal {

	public static void main(String[] args) {
		
		System.out.println("This is a Main Method");
		
		bird();
		Animal.bird();
		
		Animal obj = new Animal();
		obj.cow();
		obj.chicken();
		obj.dog();
		obj.cat();
		obj.cow();
		
		System.out.println(obj.retunType(10));
		
		String str = retunType("Mamun");
		System.out.println(str);
	
		abc("Apple",50);
			
		obj.xyz("Pine", "Cucumber", 12);	
		
	}
	
	
	//static Method  >> Static to Static we don't need to create an object, only the method name to be call
	public static void bird() {
		System.out.println("This is a Bird");
		System.out.println("This is a Bird");
		System.out.println("This is a Bird");
		
	}

	//Access Modifire >> We have to create an object of class name then call the method in the main method
	
	
	//public method making them accessible by any other class.
	public void cow() {
		System.out.println("This is a Cow");
	}
	
	
	//private method only can accessible within the declared class. 
	private void chicken() {
		System.out.println("This is a Chicken");
	}
	
	//protected method accessible in the same package and subclasses.
	protected void dog() {
		System.out.println("This is a Dog");
	}
	
	
	//default method
	void cat() {
		System.out.println("This is a Cat");
	}
	
	
	//returnType method
	public int retunType(int x) {
		return x ;
		
	   
	  }
	
	public static String retunType(String Y) {
	//	System.out.println("Hello This is String retunType Method");
		return Y ;
		
	   
	  }
	
	//static parameterized method
	public static void abc(String x, int y) {
		System.out.println("This is a Parameterized Or Args Or Input Method");
		System.out.println(x);
		System.out.println(y);
		
		
	    
	  }
	
	//Non static paramiterized method
		public void xyz(String fruit, String veg, int y) {
			System.out.println(fruit+ veg);
			
		    
		  }
	

}
