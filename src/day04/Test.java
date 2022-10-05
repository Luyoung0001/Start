package day04;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.move();
        dog.setAge(10);
        System.out.println(dog.getAge());
    }
}
