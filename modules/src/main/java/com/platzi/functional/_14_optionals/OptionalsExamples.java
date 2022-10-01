package com.platzi.functional._14_optionals;

import java.util.*;

public class OptionalsExamples {

    public static void main(String[] args) {

        List<String> names = getNames();
        if (names != null){

        }

        Optional<List<String>> optionalStrings = getOpcionalNames();
        if (optionalStrings.isPresent()){

        }

        optionalStrings.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = mostValuablePlayer();

       String valuablePlayerName = valuablePlayer.orElseGet(()-> "No player");
    }

    static List<String> getNames(){
        List<String> list = new ArrayList<>();

        return Collections.emptyList();
    }

    static String mostValuable(){
//        return "";
        return null;
    }

    static int mostExpensive(){
        return -1;
    }


    static Optional<List<String>> getOpcionalNames(){
        List<String> names = new LinkedList<>();
            //obtener nombres
        return Optional.of(names);
    }

    static Optional<String> mostValuablePlayer(){
        try {
            return Optional.of("Isaias");
        }catch(Exception e){
            e.printStackTrace();

        }
        return Optional.empty();
    }
}
