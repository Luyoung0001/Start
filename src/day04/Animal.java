package day04;

public abstract class Animal {
    public abstract void move();
    public abstract void eat();
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("dog runs!");

    }

    @Override
    public void eat() {
        System.out.println("dog eats meat!");

    }




}
