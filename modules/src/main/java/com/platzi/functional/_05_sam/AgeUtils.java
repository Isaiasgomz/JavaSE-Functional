package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.function.Function;

public class AgeUtils {

    public static void main(String[] args) {
        Function<Integer, String> addZeros = x -> x< 10 ? "0"+ x : String.valueOf(x);

        TriFunction<Integer,Integer,Integer, LocalDate> parseDate=
                (day, month, year) -> LocalDate.parse(year+"-"+ addZeros.apply(month) +
                        "-"+ addZeros.apply(day));

        TriFunction<Integer,Integer,Integer,Integer> calculateAge =
                (day, month, year) -> Period.between(
                        parseDate.aply(day,month,year), LocalDate.now()).getYears();

        System.out.println(calculateAge.aply(10,10,1992));
    }


    @FunctionalInterface
    interface  TriFunction<T,U,V,R> {
        R aply(T t, U u ,V v);
    }
}
