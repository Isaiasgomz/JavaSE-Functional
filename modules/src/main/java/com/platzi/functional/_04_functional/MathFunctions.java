package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {

        Function<Integer, Integer> squareFunction =
                new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer x) {
                        return x * x;
                    }
                };

        System.out.println( squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        Function<Integer,Boolean> isOdd = x -> x % 2 ==1;

        Predicate<Integer> isEeven = x -> x % 2 == 0;

        System.out.println(isEeven.test(4));

        Predicate<Student> isApproved = student -> student.getCalifacaion() > 6.0;

        Student isaias = new Student(5.1);

        System.out.println(isApproved.test(isaias));
    }


    static class Student{
        double califacaion;

        public Student(double califacaion) {
            this.califacaion = califacaion;
        }

        public double getCalifacaion() {
            return califacaion;
        }
    }
}
