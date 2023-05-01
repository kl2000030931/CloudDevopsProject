package com.klef.springboot.service;

import java.util.List;

import com.klef.springboot.model.Articles;
import com.klef.springboot.model.Citizen;

public interface CitizenService
{
	public Citizen addcitizen(Citizen citizen);
	public Citizen checkctzlogin(String uname,String pwd);
	public Citizen viewcitizen(String uname);
	public int changecitizenpassword(String ctzoldpwd,String ctznewpwd,String cuname);
	List<Articles> articlesforctz();
	public Articles viewarticlebyid(int id);
}