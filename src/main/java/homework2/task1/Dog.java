package homework2.task1;

public class Dog extends Animal{
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }


    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void wagtail(){
        System.out.println(name + "is wagging its tail.");
    }

}