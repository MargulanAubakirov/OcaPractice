package flowcontrol_chapter5;

public class dowhileloopDemo {
    public static void main(String args[])
    {

//        int x = 21, sum = 0;
//
//        do {
//
//            // The line will be printed even
//            // if the condition is false
//            sum += x;
//            x--;
//
//        } while (x > 10);
//        System.out.println("Summation: " + sum);

        int num=10;
        do {
            num++;
        } while (++num > 20);
        System.out.println (num);
    }
}
