package day03;

public class Man {
    private Man(){}
    private static Man man = new Man();
    public static Man manMake(){
        return man;
    }
}
