package JavaPQuestions;

public class WillStaticBlockBeExecutedWithFinalVariable {

	public static void main(String[] args) {

		System.out.println(Main.x); // with final in dot class it will write 100 inside the BiteCode
	}

}

class Main {

	public static final int x = 100;

	static {

		System.out.println("main---Class Staic block....");
	}
}
