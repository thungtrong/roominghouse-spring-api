package com.tdtu.dacntt1.roominghouse.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {
	@Id
	@SequenceGenerator(name = "room_pk_sequence", initialValue = 1, allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="room_pk_sequence")
	private Integer id;
	private String name;
	@Column(columnDefinition = "boolean default false")
	private boolean status = false;
	private Integer area;
	private String description;
	
	@ManyToOne()
	@JoinColumn(name="building_id", foreignKey = @ForeignKey(name = "room_buildingId_fk"))
	private Building building;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
	private List<Tenant> tenants;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public Room(Integer id, String name, boolean status, Integer area, String description) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.area = area;
		this.description = description;
	}
	
	public Room(Integer id, String name, boolean status, Integer area, String description, Building building,
			List<Tenant> tenants) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.area = area;
		this.description = description;
		this.building = building;
		this.tenants = tenants;
	}
	
	public List<Tenant> getTenants() {
		return tenants;
	}
	public void setTenants(List<Tenant> tenants) {
		this.tenants = tenants;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	
}
