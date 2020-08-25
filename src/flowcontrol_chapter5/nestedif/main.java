package flowcontrol_chapter5.nestedif;

public class main {
    public static void main(String[] args) {
        int score = 110;
        if (score > 200)
            if (score <400)
                if (score > 300)
                    System.out.println("1");
                else
                    System.out.println("2");
            else
                System.out.println("3");


    }
}
