package homework3.task1;

import java.io.*;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        Student stud = new Student("Александр", 20, 3.65);

        try (FileOutputStream fileOut = new FileOutputStream("student-data.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(stud);
            System.out.println("Объект Student сериализован.");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try (FileInputStream fileIn = new FileInputStream("student-data.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn)) {
            stud = (Student)in.readObject();
            System.out.println("Объект Student десериализован.");
            System.out.println("Имя: " + stud.getName());
            System.out.println("Возраст: " + stud.getAge());
            System.out.println("GPA равен: " + stud.getGPA());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
