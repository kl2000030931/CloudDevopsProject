package com.klef.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.springboot.model.Articles;
import com.klef.springboot.model.Citizen;
import com.klef.springboot.repository.ArticlesRepository;
import com.klef.springboot.repository.CitizenRepository;

@Service
public class CitizenServiceImpl implements CitizenService
{
	@Autowired
	private CitizenRepository citizenRepository;
	
	@Autowired
	private ArticlesRepository articlesRepository;

	@Override
	public Citizen addcitizen(Citizen citizen)
	{
		return citizenRepository.save(citizen);
		
	}

	@Override
	public Citizen checkctzlogin(String uname, String pwd) 
	{
		return citizenRepository.checkctzlogin(uname, pwd);
	}

	@Override
	public Citizen viewcitizen(String uname) 
	{
		
		return citizenRepository.viewcitizen(uname);
	}
	
	@Override
	public List<Articles> articlesforctz() {
		return (List<Articles>) articlesRepository.findAll();
	}
	
	@Override
	public int changecitizenpassword(String ctzoldpwd, String ctznewpwd, String cuname)
	{
		return citizenRepository.updatectzpassword(ctznewpwd, ctzoldpwd, cuname);
	}

	@Override
	public Articles viewarticlebyid(int id) {
		
		return articlesRepository.findById(id).get();
	}
	
}
