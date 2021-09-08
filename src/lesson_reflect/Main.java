package lesson_reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Class<User> userClass = User.class;
        User user = new User(1, "banan");
        Class<? extends User> uzer = user.getClass();
//        Field[] declaredFields = uzer.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            System.out.println(declaredField.getName()+" "+declaredField.get(user)+" "+declaredField.getType());
//        }

//        Method[] declaredMethods = uzer.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod.getName()+" "+declaredMethod.getParameterCount()+" "+declaredMethod.getReturnType());
//            Parameter[] parameters = declaredMethod.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println(parameter.getName()+" "+parameter.getType());
//
//            }
//            System.out.println("|----------------------------------------------------------|");
//        }

        System.out.println(user);
        Field id = uzer.getDeclaredField("id");
        id.setAccessible(true);
        id.set(user,1000);
        System.out.println(user);

    }
}
