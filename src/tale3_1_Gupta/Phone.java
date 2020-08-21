package tale3_1_Gupta;

class Phone {
    String phoneNumber = "123456789"; //instance variable
    void setNumber () {
        String phoneNumber; //local variable
        phoneNumber = "987654321";
    }
}
class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println (p1.phoneNumber);
    }
//    class Employee {
//        public int daysOffWork(int... days, String year) {
//            int daysOff = 0;
//            for (int i = 0; i < days.length; i++)
//                daysOff += days[i];
//            return daysOff;
//        }
//    }
}
//        a 123456789  X
//        b 987654321
//        c No output
//        d The class Phone will not compile.