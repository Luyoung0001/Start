package day07;
public class Teacher extends Person implements Cook, Sing{
    @Override
    public void cook() {
        System.out.println("我会做饭！");

    }
    @Override
    public void sing() {
        System.out.println("我会唱歌！");

    }
}
