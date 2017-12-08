package com.stackroute.NewsAggregator.interfac;

import java.util.List;

import com.stackroute.NewsAggregator.domain.NewsModel;

public interface NewsAggregatorInterface {
	
	public List<NewsModel> getAllNews( );
	   public  NewsModel addNewsDetails(NewsModel newsModel);
	   public  void deleteNewsDetails(Integer id);
	   

}
