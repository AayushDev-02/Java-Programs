
class Employee{
    float salary = 3000;
}

class Programmer extends Employee{
    int bonus = 1000;
}

public class Inheritance {
    public static void main(String[] args) {
        Programmer obj = new Programmer();
        System.out.println(obj.bonus);
        System.out.println(obj.salary);
    }
}
