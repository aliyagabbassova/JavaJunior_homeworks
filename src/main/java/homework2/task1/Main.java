package homework2.task1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Animal[] animalList = {
                new Dog("Buddy", 3, "Labrador"),
                new Cat("Whiskers", 2, "Gray"),
                new Dog("Max", 4, "German Shepherd"),
                new Cat("Mittens", 1, "White")
        };
        //Class<?> classAnimal = Class.forName("homework2.task1.Animal");

        for (Animal animal : animalList) {
            Class<? extends Animal> classAnimal = animal.getClass();
            // Получить список всех полей
            Field[] fields = classAnimal.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Information about animals: " + classAnimal.getSimpleName() + "-");
                System.out.println(animal.toString());
            }
            // Вызов метода
            Method makeSoundMethod = classAnimal.getDeclaredMethod("makeSound");
            makeSoundMethod.invoke(animal);
            System.out.println(animal.name + " says: " + animal.makeSound());

        }
    }
}

