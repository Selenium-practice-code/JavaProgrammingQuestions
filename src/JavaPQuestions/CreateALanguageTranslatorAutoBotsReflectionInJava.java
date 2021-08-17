package JavaPQuestions;

import java.lang.reflect.Field;

public class CreateALanguageTranslatorAutoBotsReflectionInJava {

    static {

        Field value = null;
        try {
            value = String.class.getDeclaredField("value");
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
        value.setAccessible(true);
        try {
            value.set("Hello Sumit", value.get("Hola Sumit"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }





        public static void main(String[] args) {

        System.out.println("Hello Sumit");
    }
}
