package org.example.patterns.builder;

public class Program {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("AAA");
        String str = stringBuilder
                .append("BBB")
                .append("CCC")
                .replace(1,3,"OOO")
                .delete(1,5)
                .toString();

        Order order = new OrderBuilder()
                .setProductId(3456)
                .setPrice(400)
                .setProductName("Aqua")
                .setQnt(2)
                .setClientName("Anna")
                .build();

    }

}
