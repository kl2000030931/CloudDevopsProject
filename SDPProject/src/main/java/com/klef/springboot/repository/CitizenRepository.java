package com.klef.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.springboot.model.Government;
import com.klef.springboot.model.Citizen;


@Repository
public interface CitizenRepository extends CrudRepository<Citizen, Integer>
{
	@Query("select c from Citizen c where username=?1 and password=?2")
	public Citizen checkctzlogin(String uname,String pwd);
	
	@Query("select c from Citizen c where username=?1")
	public Citizen viewcitizen(String uname);
	
	@Transactional
	@Modifying
	@Query("update Citizen c set c.password=?1 where c.password=?2 and c.username=?3")
	public int updatectzpassword(String ctznewpwd,String ctzoldpwd,String ctzuname);
}
