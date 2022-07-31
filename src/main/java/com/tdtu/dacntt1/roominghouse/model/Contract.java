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
@Table(name="contract")
public class Contract {
	@Id
	@SequenceGenerator(name="contract_pk_sequence")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "contract_pk_sequence")
	private Long id;
	
	@Column(nullable = false)
	@JsonFormat(pattern = DatePatern.PATERN)
	private Date create_date;
	
	@Column(nullable = false)
	@JsonFormat(pattern = DatePatern.PATERN)
	private Date start_date;
	
	@Column(nullable = false)
	@JsonFormat(pattern = DatePatern.PATERN)
	private Date end_date;
	
	@Column(nullable = false)
	private Long costPerMonth;
	
	// Foreign Key
	@ManyToOne
	@JoinColumn(name = "tenant_id", foreignKey = @ForeignKey(name="contract_tenantId_fk"))
	private Tenant tenant;
	
	@ManyToOne
	@JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name="contract_employeeId_fk"))
	private Employee employee;

	public Contract() {
		// TODO Auto-generated constructor stub
	}
	public Contract(Long id, Date create_date, Date start_date, Date end_date, Long costPerMonth, Tenant tenant,
			Employee employee) {
		super();
		this.id = id;
		this.create_date = create_date;
		this.start_date = start_date;
		this.end_date = end_date;
		this.costPerMonth = costPerMonth;
		this.tenant = tenant;
		this.employee = employee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Long getCostPerMonth() {
		return costPerMonth;
	}
	public void setCostPerMonth(Long costPerMonth) {
		this.costPerMonth = costPerMonth;
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
