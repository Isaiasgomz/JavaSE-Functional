package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    CLIArguments(){

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            description = "KEYWORD",
    validateWith = CLIKeywordValidator.class)
    private String keyword;
    @Parameter(
            names = {"--location", "-l"},
            description = "cuidad, codigo postal o algun otro termno para buscar una ubicaion"

    )
    private String location;
    @Parameter(
            names = {"--page", "-p"},
            description = "cada busqueta contines 50 resultados, puedes paginar mas resultados cambiando el numero de la pagina, empieza en cero"
    )
    private int page =0;
    @Parameter(
            names = "--full-time",
            description = "selecionar esta opcion si desea agregar trbajos fulltime"
    )
    private boolean isFullTime = false;
    @Parameter(
            names = "--isMarkdown",
            description = "agregar esta bandera si desea obtener los resulados en marjdown"
    )
    private boolean isMarkdown =false;

    @Parameter(
            names = "--halp",
            help = true,
            description = "muestra esta ayuda",
            validateWith = CLIHelpValidator.class
    )
    private boolean help;

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return help;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkdown=" + isMarkdown +
                ", help=" + help +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
