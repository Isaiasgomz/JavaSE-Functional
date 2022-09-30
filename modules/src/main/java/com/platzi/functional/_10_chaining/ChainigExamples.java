package com.platzi.functional._10_chaining;

public class ChainigExamples {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hola")
                .append("soy")
                .append("Isaias")
                .append("Gomez");

        System.out.println(stringBuilder);

        Chainer chainer2 = new Chainer();
        Chainer chainer3 = new Chainer();

        chainer2.sayHi();
        chainer3.seyBye();

        Chainer chainer= new Chainer();
        System.out.println(chainer.sayHi().seyBye());


    }


    static class Chainer{

        public Chainer sayHi(){
            System.out.println("hola");
            return this;
        }

        public Chainer seyBye(){
            System.out.println("adios");
            return this;
        }
    }
}
