package com.tdtu.dacntt1.roominghouse.model;

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

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@SequenceGenerator(name="employee_pk_sequence",allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="employee_pk_sequence")
	private Integer id;
	@Column(nullable = false, length=50)
	private String name;
	private String avatar;
	private boolean gender;
	@Column(nullable = false, length=13)
	private String phone;
	@Column(nullable = false, length=50)
	private String email;
	@Column(nullable = false, length=15)
	private String identity_card;
	@Column(nullable = false, length=50)
	private String hometown;
	
	// Foreign Key
	@ManyToOne()
	@JoinColumn(name="position_id", foreignKey = @ForeignKey(name="employee_positionId_fk"))
	private Position position;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, String avatar, boolean gender, String phone, String email,
			String identity_card, String hometown, Position position) {
		super();
		this.id = id;
		this.name = name;
		this.avatar = avatar;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.identity_card = identity_card;
		this.hometown = hometown;
		this.position = position;
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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentity_card() {
		return identity_card;
	}

	public void setIdentity_card(String identity_card) {
		this.identity_card = identity_card;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}
