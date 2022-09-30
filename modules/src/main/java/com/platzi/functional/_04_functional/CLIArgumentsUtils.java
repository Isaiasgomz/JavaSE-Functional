package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    static void  shouldHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Ayuda solicitada");
            }
        };

    }


    static CLIArguments generateCLI(){
        Supplier<CLIArguments>  generator = ()-> new CLIArguments();

        return  generator.get();
    }

}
