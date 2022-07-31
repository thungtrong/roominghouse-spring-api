package com.tdtu.dacntt1.roominghouse.model;

import java.util.ArrayList;
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
@Table(name="building")
public class Building {
	@Id
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name="building_pk_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="building_pk_sequence")
	private int id;
	@Column(nullable = false, length = 50)
	private String name;
	private String address;
	private String description;
	
	@OneToMany(mappedBy = "building", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Room> rooms = new ArrayList<Room>();
	
	
	public Building() {
		// TODO Auto-generated constructor stub
	}
	
	public Building(int id, String name, String address, String description) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.description = description;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		builder.append("Building [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
	

}
