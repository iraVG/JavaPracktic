package lesson_annot;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(-100, "Zhorik");
        try {
            System.out.println(human);
            validate(human);
            System.out.println(human);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void validate(Human human) throws IllegalAccessException {
        Class<? extends Human> aClass = human.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if( field.isAnnotationPresent(ValidateIntAge.class)){
                 int currentAge= (int)field.get(human);
                 if (currentAge<0){
                  //   System.out.println("ERRRRRRORRRRR");
                     ValidateIntAge annotation = field.getAnnotation(ValidateIntAge.class);
                     int defAge = annotation.defAge();
                     field.set(human,defAge);
                 }

            }
        }
    }
}
