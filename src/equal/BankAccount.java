package equal;

import java.util.ArrayList;

public class BankAccount {
    String acctNumber;
    int acctType;
    public boolean equals(Object obj) {
        if (obj != null) {
            return (acctNumber.equals(this.acctNumber) &&
                    acctType == this.acctType);
        }
        else
            return false;
    }
}
class TestMethodEquals {
    public static void main(String args[]) {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490"; b1.acctType = 4;
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(b1);
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490"; b2.acctType = 4;
        System.out.println(list.contains(b2));
    }
}

