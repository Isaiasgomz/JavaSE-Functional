package com.platzi.jobsearch.api;

import com.platzi.jobsearch.JobPosition;
import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Headers("Accept: application/json ")
public interface JobsAPI {

    @RequestLine("GET /positios.json")
    List<JobPosition> jobs (@QueryMap Map<String, Object> queryMap);


    @RequestLine("GET postions/{id}.json")
    JobPosition job (@Param("id") String id);
}
