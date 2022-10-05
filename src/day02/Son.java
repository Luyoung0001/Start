package day02;

public class Son extends Father{
    private String hobby;

    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    @Override
    public void showInfo(){
        System.out.println("name :" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("money:" + getMoney());
        System.out.println("hobby:" + getHobby());

    }

}
