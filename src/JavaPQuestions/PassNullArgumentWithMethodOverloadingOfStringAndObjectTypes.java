package JavaPQuestions;

public class PassNullArgumentWithMethodOverloadingOfStringAndObjectTypes {

	/*
	 * Method Overloading : with in the same class u have a different methods with
	 * same name but diff parameters and sequence of parameters also diff
	 * 
	 */

	public static void main(String a[]) {

		test(null);

	}

	public static void test(Object o) {

		System.out.println("Obejct Argument");
	}

	public static void test(String s) {

		System.out.println("String Argument");
	}

//	public static void test(StringBuffer f) {
//
//		System.out.println("Obejct Argument");
//	}

}
