package day02;

public class Father {
    String name;
    int age;
    private int money;


    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void showInfo(){
        System.out.println("name :" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("money:" + getMoney());
    }
}
