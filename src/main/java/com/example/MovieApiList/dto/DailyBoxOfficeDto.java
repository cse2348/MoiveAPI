package com.example.MovieApiList.dto;

public class DailyBoxOfficeDto {
    private String movieName;
    private String openDate;
    private String audienceAccum;

    public DailyBoxOfficeDto(String movieName, String openDate, String audienceAccum) {
        this.movieName = movieName;
        this.openDate = openDate;
        this.audienceAccum = audienceAccum;
    }
    // getter 3개
}
