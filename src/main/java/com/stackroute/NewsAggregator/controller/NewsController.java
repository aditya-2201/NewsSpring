package com.stackroute.NewsAggregator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.NewsAggregator.domain.NewsModel;
import com.stackroute.NewsAggregator.service.NewsService;

@RestController
@RequestMapping("/news")

public class NewsController {

	@Autowired
	private NewsService newsService;

	@RequestMapping()
	public ResponseEntity<List<NewsModel>> getAllNews() {
		List<NewsModel> resultList1 = newsService.getAllNews();
		return new ResponseEntity<List<NewsModel>>(resultList1, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> addNews(@RequestBody NewsModel newsModel)

	{
		newsService.addNewsDetails(newsModel);
		return new ResponseEntity<String>("The date set is added to the database", HttpStatus.OK);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, consumes = "application/json")
	public ResponseEntity<String> delete(@PathVariable(value = "id") Integer id) {

		newsService.deleteNewsDetails(id);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}

}
