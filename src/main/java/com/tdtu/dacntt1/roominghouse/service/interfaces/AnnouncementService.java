package com.tdtu.dacntt1.roominghouse.service.interfaces;

import java.util.List;

import com.tdtu.dacntt1.roominghouse.exception.AnnouncementNotFoundException;
import com.tdtu.dacntt1.roominghouse.model.Announcement;

public interface AnnouncementService {
	public Announcement addAnnouncement(Announcement announcement);
	
	public List<Announcement> findAllAnnouncement();
	
	
	public Announcement findAnnouncementById(Long id) throws AnnouncementNotFoundException;
	
	
	public Announcement updateAnnouncement(Announcement announcement);
	
	public void deleteAnnouncementById(Long id);
	
}
