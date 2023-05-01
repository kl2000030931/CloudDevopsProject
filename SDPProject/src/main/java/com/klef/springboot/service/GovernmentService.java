package com.klef.springboot.service;

import java.util.List;

import com.klef.springboot.model.Government;
import com.klef.springboot.model.Articles;
import com.klef.springboot.model.Citizen;

public interface GovernmentService
{
	public Government checkgovernmentlogin(String uname,String pwd);
	public List<Citizen> viewallcitizen();
	public void deletecitizen(int id);
	public Citizen viewcitizenbyid(int id);
	public List<Articles> viewallarticles();
	public void deletearticle(int no);
	public Articles addarticles(Articles articles);
}
