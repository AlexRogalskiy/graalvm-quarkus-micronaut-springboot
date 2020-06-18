package com.mycompany.quarkuselasticsearch.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class SearchMovieResponse {

    private List<Hit> hits;
    private String took;
    private Error error;

    @Data
    public static class Hit {
        private String index;
        private String id;
        private Float score;
        private String source;
    }

    @Data
    @AllArgsConstructor
    public static class Error {
        private String message;
    }

}
