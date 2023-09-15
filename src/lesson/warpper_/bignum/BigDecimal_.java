package lesson.warpper_.bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("149750734085.108957325453");
        System.out.println(bigDecimal);

        BigDecimal bigDecimal1 = new BigDecimal("1.234");

        System.out.println("add : " + bigDecimal.add(bigDecimal1));
        System.out.println("substract : " + bigDecimal.subtract(bigDecimal1));
        System.out.println("multiply : " + bigDecimal.multiply(bigDecimal1));
        //除法时可能会报错，可能出现无穷小数
        //可以指定精度BigDecimal.ROUND_CEILING, 如果有无限循环小数就会保留分子的精度
        System.out.println("divide : " + bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));

    }
}
