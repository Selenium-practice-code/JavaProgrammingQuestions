package Top10StaticAndnstanceBlockBasedInterviewQuestions;

public class HowCanWeRunAJavaProgramWithoutMakingAnyObject {

	static {

		System.out.println("Static block");
	}

	public static void test() {

		System.out.println("Static Method");
	}

	public static void main(String[] args) {

		System.out.println("Main method");
		test();
		HowCanWeRunAJavaProgramWithoutMakingAnyObject.test();

	}

}
