package coditionStatement;

public class If_Else_If_Statement {

	public static void main(String[] args) {
		
		int D = 9;

		if(D < 7) {
			System.out.println("Diabetic");

		}else if(D < 5){
			System.out.println("Non Diabetic");
			
		}else if(D> 8){
			System.out.println("Poor Control");
		}

		else {
			System.out.println("Pre Diabetic");
		
		}	

	}

}
	
