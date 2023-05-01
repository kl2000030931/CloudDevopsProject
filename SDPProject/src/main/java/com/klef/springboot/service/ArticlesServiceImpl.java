package com.klef.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klef.springboot.model.Articles;
import com.klef.springboot.repository.ArticlesRepository;


 
@Service
@Transactional
public class ArticlesServiceImpl implements ArticlesService{

	@Autowired
	private ArticlesRepository articlesRepository;
	

	@Override
	public Articles addarticles(Articles articles) {
		return articlesRepository.save(articles);
	}


	

}
