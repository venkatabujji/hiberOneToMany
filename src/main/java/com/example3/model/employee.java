package com.example3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

  
   @Entity
   @Table(name="employees")
  public class employee
  {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int id;
	  
	  @Column(name="emp_name")
	  private String name;
	  
	  @ManyToOne
		@JoinColumn(name="dept_id")
		private department department;


	public employee(int id, String name, department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public department getDepartment() {
		return department;
	}

	public void setDepartment(department department) {
		this.department = department;
	}

	public employee() 
	{
		super();
		
	}
	  
	  
  }
  

