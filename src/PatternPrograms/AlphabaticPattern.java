package PatternPrograms;

public class AlphabaticPattern {

	public static void main(String[] args) {

//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 
		
		int alpha = 65;

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alpha + j) + " ");
			}

			System.out.println();

		}
	}
}
