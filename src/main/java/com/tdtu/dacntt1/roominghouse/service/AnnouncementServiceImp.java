package com.tdtu.dacntt1.roominghouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdtu.dacntt1.roominghouse.exception.AnnouncementNotFoundException;
import com.tdtu.dacntt1.roominghouse.exception.BuildingNotFoundException;
import com.tdtu.dacntt1.roominghouse.model.Announcement;
import com.tdtu.dacntt1.roominghouse.repo.AnnouncementRepository;
import com.tdtu.dacntt1.roominghouse.service.interfaces.AnnouncementService;

@Service
@Transactional
public class AnnouncementServiceImp implements AnnouncementService{
	private final AnnouncementRepository announcementRepo;

	@Autowired
	public AnnouncementServiceImp(AnnouncementRepository announcementRepo) {
		super();
		this.announcementRepo = announcementRepo;
	}
	
	// CRUD
	public Announcement addAnnouncement(Announcement announcement)
	{
		return announcementRepo.save(announcement);
	}
	
	public List<Announcement> findAllAnnouncement()
	{
		return announcementRepo.findAll();
	}
	
	public Announcement findAnnouncementById(Long id) throws AnnouncementNotFoundException
	{
		return announcementRepo.findById(id).orElseThrow(() -> new AnnouncementNotFoundException(String.format("Not found announcement have a id = %s", id)));
	}
	
	public Announcement updateAnnouncement(Announcement announcement)
	{
		return announcementRepo.save(announcement);
	}
	
	public void deleteAnnouncementById(Long id)
	{
		announcementRepo.deleteById(id);
	}
	
	
}
