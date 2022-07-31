package com.tdtu.dacntt1.roominghouse.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdtu.dacntt1.roominghouse.exception.AnnouncementNotFoundException;
import com.tdtu.dacntt1.roominghouse.model.Announcement;
import com.tdtu.dacntt1.roominghouse.service.AnnouncementServiceImp;

@RestController
@RequestMapping("api/announcement")
public class AnnouncementController {
	private final AnnouncementServiceImp service;

	public AnnouncementController(AnnouncementServiceImp serive) {
		super();
		this.service = serive;
	}

	// CRUD
	@PostMapping("/add")
	public ResponseEntity<Announcement> addAnnouncement(@RequestBody Announcement announcement) {
		announcement = service.addAnnouncement(announcement);
		return new ResponseEntity<>(announcement, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Announcement>> getAllAnnouncement() {
		List<Announcement> list = service.findAllAnnouncement();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Announcement> findAnnouncementById(@PathVariable Long id) {
		Announcement announcement;
		try {
			announcement = service.findAnnouncementById(id);
		} catch (AnnouncementNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		 return new ResponseEntity<>(announcement, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Announcement>  updateAnnouncement(@RequestBody Announcement announcement) {
		announcement = service.updateAnnouncement(announcement);
		return new ResponseEntity<Announcement>(announcement, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteAnnouncementById(Long id) {
		service.deleteAnnouncementById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
