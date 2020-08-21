package passing_primitives_to_methods;

public class Employee {
    int age;
    void modifyVal(int age) {
        age = age + 1;

        System.out.println(age);
    }
}
class Office {
    public static void main(String args[]) {
        Employee e = new Employee();
        System.out.println(e.age);
        e.modifyVal(e.age);
        System.out.println(e.age);
    }
//    StringBuilder name = StringBuilder.getInstance();
//    StringBuilder name = StringBuilder.createInstance();
//    StringBuilder name = StringBuilder.buildInstance();
}
