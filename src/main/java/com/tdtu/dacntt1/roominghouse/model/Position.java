package com.tdtu.dacntt1.roominghouse.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="position")
public class Position {
	@Id
	@SequenceGenerator(name = "position_pk_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "position_pk_sequence")
	private Integer id;
	@Column(nullable = false, length = 50, unique = true)
	private String name;
	private String description;
	
	// Foreign Key
	@OneToMany(mappedBy = "position",cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	List<Employee> employees;
	public Position() {
		// TODO Auto-generated constructor stub
	}
	public Position(Integer id, String name, String description, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.employees = employees;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
