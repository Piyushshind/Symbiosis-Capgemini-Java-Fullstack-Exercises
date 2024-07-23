class rbi {
    int totalAmount = 1000;

    public void addAmount(int a) {
        totalAmount += a;
    }

    public void DeductAmount(int a) {
        totalAmount -= a;
    }
}

class sbi extends rbi {
    int sbiAmount = 100;

    sbi() {
        System.out.println(" No action");
    }

    sbi(int a) {
        sbiAmount = a;
    }

    public void deduct(int a) {
        totalAmount -= (sbiAmount - a);
    }

    public void Add(int a) {
        totalAmount += (sbiAmount + a);
    }

    public void print() {
        System.out.println("Total amont is :- " + totalAmount);
    }
}

class hdfc extends rbi {
    int hdfcAmount = 500;

    hdfc() {
        System.out.println(" No action");
    }

    hdfc(int a) {
        hdfcAmount = a;
    }

    public void deduct(int a) {
        totalAmount -= (hdfcAmount - a);
    }

    public void Add(int a) {
        totalAmount += (hdfcAmount + a);
    }

    public void print() {
        System.out.println("Total amont is :- " + totalAmount);
    }
}

public class bank {
    public static void main(String[] args) {
        hdfc H = new hdfc(148);
        sbi S = new sbi(845);

        H.Add(400);
        H.deduct(300);
        H.print();
        S.Add(700);
        S.deduct(500);
        S.print();
    }
}
