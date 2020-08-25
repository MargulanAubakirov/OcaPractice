package flowcontrol_chapter5.ternary;

public class main {
    public static void main(String[] args) {
        int bill = 2000;
        int qty = 10;
        int discount = (bill > 1000)? (qty > 11)? 10 : 9 : 5;
        System.out.println(discount);
    }
}

