package com.axamit.atg.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import atg.adapter.gsa.GSARepository;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;

@Controller
@RequestMapping("/hello")
public class HelloWorldWS {
	
	@Autowired
	private ApplicationContext applicationContext;
	

	@RequestMapping(value = "/msg", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RepositoryItem addMsg(@RequestParam("msg") String msg) throws RepositoryException {
		MutableRepository repository = applicationContext.getBean("singleStringRepository", GSARepository.class);
		MutableRepositoryItem newItem = repository.createItem("singleString");
		newItem.setPropertyValue("msg", msg);
		RepositoryItem addedItem = repository.addItem(newItem);
		return addedItem;
	}
	
	
}
