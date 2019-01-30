package org.delta.movix.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Movie implements Serializable {

    private Long id;
    private Long imdbId;
    private Long tmdbId;
    private String title;
    private Integer year;
    private String poster;
    private String summary;
    private String time;
    private BigDecimal rating;

}
