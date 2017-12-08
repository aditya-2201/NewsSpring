package com.stackroute.NewsAggregator.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.NewsAggregator.domain.NewsModel;


@Repository
public interface NewsAggregatorRepository extends CrudRepository<NewsModel, Integer>
{
    
}



