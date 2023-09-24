package com.example3.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



 

	@Entity
	  @Table(name="departments")
	  public class department
	  {
		  @Id
		  @GeneratedValue(strategy=GenerationType.IDENTITY)
		  @Column(name="dept_id")
		  private int id;
		  
		  @Column(name="dep_name")
		  private String name;
		  
		  @OneToMany(mappedBy="department",cascade=CascadeType.ALL)
		  private List<employee> employees=new ArrayList<employee>();

		public department(int id, String name, List<employee> employees) {
			super();
			this.id = id;
			this.name = name;
			this.employees = employees;
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

		public List<employee> getEmployees() {
			return employees;
		}

		public void setEmployees(List<employee> employees) {
			this.employees = employees;
		}

		public department()
		{
			super();
		
		}
		  
		
		  
		  
}
