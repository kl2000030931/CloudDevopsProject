package com.klef.springboot.repository;
 
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.klef.springboot.model.Articles;
 
public interface ArticlesRepository extends CrudRepository<Articles, Integer> {
	
}