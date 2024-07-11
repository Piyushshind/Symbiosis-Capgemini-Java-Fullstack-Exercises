
/*
 * Java Program to Calculate Taxes
Using the double types, implement the following: Suppose a product costs 9.99 net, calculate its gross value (we assume VAT of 23%). Then multiply it by 10,000 (i.e., we sold 10,000 pcs of this product), and calculate this value excluding VAT.
Implement the above actions using the Big Decimal class. Print on the console all computed values and compare their values. What conclusions do you have?
 */
import java.math.BigDecimal;

public class caltax {

    public static void main(String[] args) {
        double netValue = 9.99;
        double VAT = 23.0;
        // calculating grossValue
        double grossValue = netValue + (VAT * netValue / 100);
        System.out.println("The gross value is: " + grossValue);
        // multiplying the value by 10000
        double grossValue10000 = grossValue * 10000;
        System.out.println("The gross value for 10000 units is: " + grossValue10000);
        // calculating price excluding VAT 23%
        double excludingVAT = grossValue10000 - (VAT * grossValue10000 / 100);
        System.out.println("The value for 10000 units excluding VAT is: " + excludingVAT);
        // doing the same operations using BigDecimal instead of double
        System.out.println("\n----Using BigDecimal instead of double----\n");
        BigDecimal netValue_big = new BigDecimal("9.99");
        BigDecimal VAT_big = new BigDecimal("23.0");
        BigDecimal HUNDRED = new BigDecimal("100");
        BigDecimal TenThousand = new BigDecimal("10000");
        // calculating grossValue
        BigDecimal grossValue_big = netValue_big.add(VAT_big.multiply(netValue_big.divide(HUNDRED)));
        System.out.println("The gross value is: " + grossValue_big);

        // multiplying the value by 10000
        BigDecimal grossValue10000_big = grossValue_big.multiply(TenThousand);
        System.out.println("The gross value for 10000 units is: " + grossValue10000_big);
        // calculating price excluding VAT 23%
        BigDecimal excludingVAT_big = grossValue10000_big
                .subtract(VAT_big.multiply(grossValue10000_big.divide(HUNDRED)));
        System.out.println("The value for 10000 units excluding VAT is: " + excludingVAT_big);
        System.out.println("\nThe accuracy is higher when we use BigDecimal instead of double");
    }
}