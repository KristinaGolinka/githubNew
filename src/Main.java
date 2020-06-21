import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Class carClass = car.getClass();
        Constructor[] declaredConstructors = carClass.getDeclaredConstructors();
        for (Constructor constructor: declaredConstructors) {
            System.out.println(constructor.getName());
            int modifiers = constructor.getModifiers();
            System.out.println(Modifier.toString(modifiers));
             Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter: parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
            Field[] declaredFields = carClass.getDeclaredFields();
            for (Field field: declaredFields ) {
                System.out.println(field);
                System.out.println(field.getName());
                System.out.println(field.getType().getName());
                System.out.println(Modifier.toString(field.getModifiers()));
            }
            Method[] declaredMethods = carClass.getDeclaredMethods();
            for (Method method: declaredMethods) {
                System.out.println(method);
            }



        }



    }
}
