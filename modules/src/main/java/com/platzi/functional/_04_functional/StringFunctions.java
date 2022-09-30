package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\""+ text +"\"";

        System.out.println(quote.apply("java"));


        UnaryOperator<String> mark = text -> text+"!";

        System.out.println(mark.apply("isaias"));

        BiFunction<String,Integer,String> leftPad =
                (text, number) -> String.format("%"+ number + "s" ,text);

        System.out.println(leftPad.apply("java", 10));



    }

}
