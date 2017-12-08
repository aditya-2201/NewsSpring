package com.stackroute.NewsAggregator.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.NewsAggregator.domain.NewsModel;
import com.stackroute.NewsAggregator.interfac.NewsAggregatorInterface;
import com.stackroute.NewsAggregator.repository.NewsAggregatorRepository;

@Service
public class NewsService implements NewsAggregatorInterface{

	@Autowired
	public NewsAggregatorRepository newsAggregatorRepository;
	
	public List<NewsModel> getAllNews(){
	       
		List<NewsModel> newsList= (List<NewsModel>)newsAggregatorRepository.findAll();
		return newsList;
		    }
//	@Override
	public NewsModel addNewsDetails(NewsModel newsModel)
    {
		newsAggregatorRepository.save(newsModel);
    	return newsModel;
    }
	
@Override
	public void deleteNewsDetails(Integer id) {
	newsAggregatorRepository.delete(id);	
	}
    
/*public static void deleteUserById(int id) {
        
        for (Iterator<Restaurant> iterator = restaurants.iterator(); iterator.hasNext(); ) {
            Restaurant restaurant = iterator.next();
            if (restaurant.getId() == id) {
                repository.delete(id);private static List<NewsModel> newsDetails;private static List<NewsModel> newsDetails;
            }
        }
    }*/
    }
	
	

	


