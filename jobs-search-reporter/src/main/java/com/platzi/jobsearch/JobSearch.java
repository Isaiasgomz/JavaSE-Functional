package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;
import com.platzi.jobsearch.api.JobsAPI;
import com.platzi.jobsearch.cli.CLIArguments;
import com.platzi.jobsearch.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.platzi.jobsearch.ComanderFunctions.buildCoomanderWithName;
import static com.platzi.jobsearch.ComanderFunctions.parseArguments;
import static com.platzi.jobsearch.api.APIFunctions.buildAPI;

public class JobSearch {

    public static void main(String[] args) {
        JCommander jCommander = buildCoomanderWithName("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCli =
                parseArguments( jCommander, args , JCommander::usage)
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj);


        Optional<CLIArguments> cliOptional =
                streamOfCli
                        .filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getKeyword() != null)
                        .findFirst();

        cliOptional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }

    private static Stream<JobPosition> executeRequest(Map<String,Object> options){
        JobsAPI api = buildAPI(JobsAPI.class, "https://jobs.github.com");

        return Stream.of(options)
                .map(api::jobs)
                .flatMap(Collection::stream);
    }

}
