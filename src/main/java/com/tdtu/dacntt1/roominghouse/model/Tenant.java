package com.tdtu.dacntt1.roominghouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tenant")
public class Tenant {
	@Id
	@SequenceGenerator(name = "tenant_pk_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tenant_pk_sequence")
	private Long id;
	@Column(nullable = false, length = 50)
	private String name;
	private String avatar;
	private boolean gender;
	@Column(nullable = false, length = 13)
	private String phoneNumber;
	private String email;
	@Column(nullable = false, length=15, unique=true)
	private String indentity_card;
	@Column(length=50)
	private String job;
	@Column(length=50)
	private String hometown;
	
	// Foreign Key
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id", foreignKey = @ForeignKey(name="tenant_roomId_fk"))
	private Room room;
	
	public Tenant() {
		// TODO Auto-generated constructor stub
	}

	public Tenant(Long id, String name, String avatar, boolean gender, String phoneNumber, String email,
			String indentity_card, String job, String hometown) {
		super();
		this.id = id;
		this.name = name;
		this.avatar = avatar;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.indentity_card = indentity_card;
		this.job = job;
		this.hometown = hometown;
	}

	public Tenant(Long id, String name, String avatar, boolean gender, String phoneNumber, String email,
			String indentity_card, String job, String hometown, Room room) {
		super();
		this.id = id;
		this.name = name;
		this.avatar = avatar;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.indentity_card = indentity_card;
		this.job = job;
		this.hometown = hometown;
		this.room = room;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndentity_card() {
		return indentity_card;
	}

	public void setIndentity_card(String indentity_card) {
		this.indentity_card = indentity_card;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
}
