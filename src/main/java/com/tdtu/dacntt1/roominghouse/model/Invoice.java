package com.tdtu.dacntt1.roominghouse.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="invoice")
public class Invoice {
	@Id
	@SequenceGenerator(name="invoice_pk_sequence",allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="invoice_pk_sequence")
	private Long id;
	@Column(nullable=false)
	private String name;
	@JsonFormat(pattern = DatePatern.PATERN)
	private Date date;
	private boolean status;
	private Integer electic;
	private Integer water;
	private Integer internet;
	private Integer other;
	private Long electicCost;
	private Long waterCost;
	private Long internetCost;
	private Long otherCost;
	private String note;
	// Foreign Key
	@ManyToOne
	@JoinColumn(name = "tenant_id", foreignKey = @ForeignKey(name="invoice_tenantId_fk"))
	private Tenant tenant;
	@ManyToOne
	@JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name="invoice_employeeId_fk"))
	private Employee employee;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}
	
	public Invoice(Long id, String name, Date date, boolean status, Integer electic, Integer water, Integer internet,
			Integer other, Long electicCost, Long waterCost, Long internetCost, Long otherCost, String note,
			Tenant tenant, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.status = status;
		this.electic = electic;
		this.water = water;
		this.internet = internet;
		this.other = other;
		this.electicCost = electicCost;
		this.waterCost = waterCost;
		this.internetCost = internetCost;
		this.otherCost = otherCost;
		this.note = note;
		this.tenant = tenant;
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getElectic() {
		return electic;
	}

	public void setElectic(Integer electic) {
		this.electic = electic;
	}

	public Integer getWater() {
		return water;
	}

	public void setWater(Integer water) {
		this.water = water;
	}

	public Integer getInternet() {
		return internet;
	}

	public void setInternet(Integer internet) {
		this.internet = internet;
	}

	public Integer getOther() {
		return other;
	}

	public void setOther(Integer other) {
		this.other = other;
	}

	public Long getElecticCost() {
		return electicCost;
	}

	public void setElecticCost(Long electicCost) {
		this.electicCost = electicCost;
	}

	public Long getWaterCost() {
		return waterCost;
	}

	public void setWaterCost(Long waterCost) {
		this.waterCost = waterCost;
	}

	public Long getInternetCost() {
		return internetCost;
	}

	public void setInternetCost(Long internetCost) {
		this.internetCost = internetCost;
	}

	public Long getOtherCost() {
		return otherCost;
	}

	public void setOtherCost(Long otherCost) {
		this.otherCost = otherCost;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
}
