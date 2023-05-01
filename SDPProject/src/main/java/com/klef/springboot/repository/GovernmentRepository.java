package com.klef.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.springboot.model.Government;

@Repository
public interface GovernmentRepository extends CrudRepository<Government,String>
{
	@Query("select a from Government a where username=?1 and password=?2")
	public Government checkagovernmentlogin(String uname,String pwd);
}
