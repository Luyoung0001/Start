package day01;

public class Person {
    private int age;
    private float hight;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHight() {
        return hight;
    }
    public void setHight(float hight) {
        this.hight = hight;
    }
    public void speak(){
        System.out.println("Hello, I am a " + this.getAge() + " yeas old person!");
    }
}
