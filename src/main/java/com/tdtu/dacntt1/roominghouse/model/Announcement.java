package com.tdtu.dacntt1.roominghouse.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "announcement")
public class Announcement {
	
	@Id
	@SequenceGenerator(
			name = "announcement_pk_sequence",
			initialValue=1,
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator="annoucement_pk_sequence")
	private Long id;
	@Column(nullable=false)
	private String title;
	private String body;
	@JsonFormat(pattern = DatePatern.PATERN)
	private Date date;
	
	public Announcement() {
		// TODO Auto-generated constructor stub
	}
	
	public Announcement(Long id, String title, String body, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Announcement [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", body=");
		builder.append(body);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	
	
}
