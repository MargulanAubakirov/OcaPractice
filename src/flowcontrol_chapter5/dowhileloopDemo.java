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


//do-while
        int num=10;
        do {
            num++;
        } while (++num > 20);
        System.out.println (num);

        //while
        int num2=10;
        while (++num2 > 20) {
            num2++;
        }
        System.out.println(num2);
    }
}
