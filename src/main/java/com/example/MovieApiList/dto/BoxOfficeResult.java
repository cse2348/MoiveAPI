package com.example.MovieApiList.dto;

import java.util.List;

public class BoxOfficeResult {
    private List<DailyBoxOfficeRaw> dailyBoxOfficeList;
    public List<DailyBoxOfficeRaw> getDailyBoxOfficeList() { return dailyBoxOfficeList; }
}
