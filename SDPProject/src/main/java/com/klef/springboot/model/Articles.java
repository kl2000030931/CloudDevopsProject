package com.klef.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article_table")
public class Articles
{
  @Id
  @GeneratedValue
   private int no;
  @Column(nullable=false)
  private String name;
  @Column(nullable=false)
  private String description;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Articles [no=" + no + ", name=" + name + ", description=" + description + "]";
}

}
