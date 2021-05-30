package coditionStatement;

public class For_Each_Loop_Statement {

	public static void main(String[] args) {
		
		int[] num = {10,20,30,40,50,60,70};

		String[] names = {"hasan", "rayhan", "abcd", "erham","nasir","tipu","emad"};

		for(int eachNum : num ) {
		System.out.println(eachNum);
		}

		/*for (int eachNum : num) {
			System.out.println(eachNum);

		}*/
		
		//Syntax
		/*for(DataType eachCollections : Collection){
			Statement(eachCollections );
			}*/

				
		for(String eachName : names) {
		System.out.println(eachName);
	}

	}
		
		
		
	}


