package day06;

public class Test extends Animal implements People{
    @Override
    public void move() {
        System.out.println("MOVING");

    }
    @Override
    public void eat() {
        System.out.println("EATING");

    }
    public static void main(String[] args) {
        Test t = new Test();
        t.move();
        t.eat();

    }
}
