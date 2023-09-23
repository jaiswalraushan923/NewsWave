package com.example.newswave;

import com.example.newswave.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListner<NewsApiResponse> {

    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
