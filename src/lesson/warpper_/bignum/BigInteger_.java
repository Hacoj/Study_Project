package lesson.warpper_.bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1248357823407834792087432");
        BigInteger bigInteger1 = new BigInteger("12348970");
        BigInteger bigInteger2 = new BigInteger("2344362454734");

        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println(add);
        BigInteger sub = bigInteger1.subtract(bigInteger2);
        System.out.println(sub);
        BigInteger mut = bigInteger1.multiply(bigInteger2);
        System.out.println(mut);
        BigInteger div = bigInteger2.multiply(bigInteger1);
        System.out.println(div);
        System.out.println(bigInteger);
    }
}
