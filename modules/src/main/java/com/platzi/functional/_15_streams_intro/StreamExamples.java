package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> courses = NombresUtils.getList(
                "Java!",
                "backned!",
                "frontend",
                "full stack"
        );

        for (String course: courses) {
            String newCourse = course.toLowerCase().replace("!", "!!");
            System.out.println(newCourse);
        }


        Stream<String> coursesStream = Stream.of("Java!",
                "backned!",
                "frontend",
                "full stack");


        Stream<Integer> coursesLength = coursesStream.map(course -> course.length());

        Optional<Integer> longCourse = coursesLength.max((x,y) -> y -x);

        Stream<String> emphasisCourse = coursesStream.map(course -> course + "!!");

        Stream<String> justJavaCourses = emphasisCourse.filter( course -> course.contains("Java"));

        justJavaCourses.forEach(System.out::println);


        Stream<String> coursesStream2 = courses.stream();

        addOperator(
                coursesStream2.map(course -> course + "!!")
                .filter(course -> course.contains("Java"))

        ).forEach(System.out::println);
    }

    static <T> Stream<T> addOperator(Stream<T> stream){
        return stream.peek(dato -> System.out.println("Dato: " + dato));
    }
}
