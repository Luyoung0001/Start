package day05;

public class Test {
    public static void main(String[] args) {
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.ID = "00002312";
        commonEmployee.name = "LOL";
        commonEmployee.salary = 12000;
        commonEmployee.work();
        //+++++++++++++++++++++++++++++++++
        Manager manager = new Manager();
        manager.bonus = 1000000000;
        manager.ID = "001";
        manager.name = "Jack Ma";
        manager.salary = 1;
        manager.work();

    }
}
