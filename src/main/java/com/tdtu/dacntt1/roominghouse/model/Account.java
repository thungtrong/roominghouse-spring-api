package com.tdtu.dacntt1.roominghouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="account")
public class Account {
	@Id
	private String username;
	@Column(nullable = false)
	private String password;
	
	// Foreign Key
	@OneToOne
	@JoinColumn(name="role_id", foreignKey=@ForeignKey(name="account_roleId_fk"))
	private Role role;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id", foreignKey=@ForeignKey(name="account_employeeId_fk"))
	private Employee employee; 
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String username, String password, Role role, Employee employee) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.employee = employee;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
