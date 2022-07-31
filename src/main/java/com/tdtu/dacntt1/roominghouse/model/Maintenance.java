package com.tdtu.dacntt1.roominghouse.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="maintenance_cost")
public class Maintenance {
	
	@Id
	@SequenceGenerator(name = "maintenance_pk_sequence", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="maintenance_pk_sequence")
	private Integer id;
	private String name;
	private Double cost;
	@JsonFormat(pattern = DatePatern.PATERN)
	private Date date;
	private String description;
	
	public Maintenance() {
		// TODO Auto-generated constructor stub
	}
	
	public Maintenance(Integer id, String name, Double cost, Date date, String description) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.date = date;
		this.description = description;
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
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Maintenance [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", date=");
		builder.append(date);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
	
}
