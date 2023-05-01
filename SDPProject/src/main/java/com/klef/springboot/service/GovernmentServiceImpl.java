package com.klef.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.springboot.model.Articles;
import com.klef.springboot.model.Citizen;
import com.klef.springboot.model.Government;
import com.klef.springboot.repository.ArticlesRepository;
import com.klef.springboot.repository.CitizenRepository;
import com.klef.springboot.repository.GovernmentRepository;


@Service
public class GovernmentServiceImpl implements GovernmentService
{
	@Autowired
	private GovernmentRepository governmentRepository;
	
	@Autowired
	private CitizenRepository citizenRepository;
	
	@Autowired
	private ArticlesRepository articlesRepository;
	
	@Override
	public Government checkgovernmentlogin(String uname, String pwd) 
	{
		return governmentRepository.checkagovernmentlogin(uname, pwd);
	}

	@Override
	public List<Citizen> viewallcitizen() 
	{
		return (List<Citizen>) citizenRepository.findAll();
	}

	@Override
	public void deletecitizen(int id)
	{
		citizenRepository.deleteById(id);
		
	}

	@Override
	public Citizen viewcitizenbyid(int id)
	{
		return citizenRepository.findById(id).get();
	}
	
	@Override
	public List<Articles> viewallarticles() {
		return (List<Articles>) articlesRepository.findAll();

	}
	@Override
	public Articles addarticles(Articles articles)
	{
		return articlesRepository.save(articles);
		
	}

	@Override
	public void deletearticle(int no) {
		// TODO Auto-generated method stub
		articlesRepository.deleteById(no);
		
	}

	

}
