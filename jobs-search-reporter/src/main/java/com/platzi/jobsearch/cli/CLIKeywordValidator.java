package com.platzi.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeywordValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if (!value.matches("^[a-zA-Z]+[0-9]*$")){
            System.err.println("Keyword: " + value+ "no valido, solo valores alfanumericas");
            throw new ParameterException("Only alphanumerics are supported");
        }
    }
}
